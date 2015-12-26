package by.home.controller;

import by.home.entity.*;
import by.home.service.*;
import by.home.util.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Set;

import static by.home.util.Literal.*;

/**
 * Created by DASHKA on 12.12.2015.
 */
@Controller
public class GeneralController {
    @Autowired
    private IProfileService profileService;
    @Autowired
    private IMessageService messageService;
    @Autowired
    private IUserService userService;
    @Autowired
    private IGiftService giftService;
    @Autowired
    private INewsService newsService;
    @Autowired
    private IReportService reportService;
    @Autowired
    private IStoreService storeService;


    /**
     * @roseuid 5669F0C4020D
     */
    public GeneralController() {

    }

    /**
     * @return String
     * @roseuid 565C6E4700CC
     */
    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String editProfile(@PathVariable("id") Integer id, ModelMap model) {
        model.addAttribute("id", id);
        model.addAttribute("client", profileService.findProfile(id));

        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "../editProfile.jsp";
    }

    @RequestMapping(value = "/{id}/editProfile", method = RequestMethod.POST)
    public String editProfile(@PathVariable("id") Integer id,
                              @RequestParam("city") String city,
                              @RequestParam("birthday") String birthday,
                              @RequestParam("phone") String phone,
                              @RequestParam("study") String study,
                              @RequestParam("work") String work,
                              @RequestParam("aboutMe") String aboutMe,
                              ModelMap model) {
        model.addAttribute("id", id);
        profileService.update(id, city, birthday, phone, study, work, aboutMe);
        return "redirect:/{id}";
    }

    /**
     * @return String
     * @roseuid 565C6E620217
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String showProfile(@PathVariable Integer id, ModelMap model) {
        Profile client = profileService.findProfile(id);
        model.addAttribute("id", id);
        model.addAttribute("client", client);
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "profile.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6E6F036B
     */
    @RequestMapping(value = "/{id}/search", method = RequestMethod.GET)
    public String searcherShow(@PathVariable("id") Integer id, ModelMap model) {
        model.addAttribute("id", id);
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "../search.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6E7A0127
     */
    @RequestMapping(value = "/{id}/searchUser", method = RequestMethod.POST)
    public String searchProfile(@PathVariable("id") Integer id,
                                @RequestParam("name") String name,
                                @RequestParam("lastName") String lastName,
                                @RequestParam("city") String city,
                                @RequestParam("study") String study,
                                @RequestParam("work") String work,
                                ModelMap model) {
        model.addAttribute("id", id);
        ArrayList<Profile> clientList = profileService.search(name, lastName, city, study, work);
        if (clientList.size() == 0) {
            model.addAttribute("msgSearch", MSG_SEARCH_NOT_RESULT);
        } else {
            model.addAttribute("searchResults", clientList);
        }
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "../searchResult.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6E8D026B
     */
    @RequestMapping(value = "/{id}/friend", method = RequestMethod.GET)
    public String showFriends(@PathVariable Integer id, ModelMap model) {
        Set<Profile> friends = profileService.getFriends(id);
        model.addAttribute("friends", friends);
        model.addAttribute("id", id);
        model.addAttribute("client", profileService.findProfile(id));
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "../friends.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6E960177
     */
    @RequestMapping(value = "/{id}/friend/{friendId}", method = RequestMethod.GET)
    public String showFriendProfile(@PathVariable Integer id, @PathVariable Integer friendId, ModelMap model) {
        Profile client = profileService.findProfile(friendId);
        model.addAttribute("id", id);
        model.addAttribute("client", client);
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "../../friendProfile.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6E9F037B
     */
    @RequestMapping(value = "/{id}/addFriend/{idFriend}", method = RequestMethod.GET)
    public String addFriends(@PathVariable Integer id,
                             @PathVariable Integer idFriend,
                             ModelMap model) {
        if (profileService.checkFriendAdd(id, idFriend)) {
            model.addAttribute("msgFriendsStatus", MSG_USER_IN_FRIENDS);
        } else if (id.equals(idFriend)) {
            model.addAttribute("msgFriendsStatus", MSG_USER_ADD_YOURSELF);
        } else {
            profileService.addFriend(id, idFriend);
            model.addAttribute("msgFriendsStatus", MSG_ADD_FRIEND_SUCCESS);
        }
        model.addAttribute("id", id);
        model.addAttribute("client", profileService.findProfile(idFriend));
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "/friendProfile.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6EAC006B
     */
    @RequestMapping(value = "/{id}/removeFriend/{idFriend}", method = RequestMethod.GET)
    public String removeFriends(@PathVariable Integer id,
                                @PathVariable Integer idFriend,
                                ModelMap model) {
        if (!profileService.checkFriendAdd(id, idFriend)) {
            model.addAttribute("msgFriendsStatus", MSG_USER_NOT_FRIEND);
        } else {
            profileService.removeFriend(id, idFriend);
            model.addAttribute("msgFriendsStatus", MSG_USER_REMOVE_FROM_FRIEND);
        }
        model.addAttribute("friends", profileService.getFriends(id));
        model.addAttribute("id", id);
        model.addAttribute("client", profileService.findProfile(id));
        model.addAttribute("removeFriend", profileService.findProfile(idFriend));
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "/friends.jsp";
    }

    @RequestMapping(value = "/{id}/payGift/{idGift}", method = RequestMethod.GET)
    public String buyGift(@PathVariable Integer id,
                          @PathVariable Integer idGift,
                          ModelMap model) {

        model.addAttribute("countMess", messageService.getCountUnread(id));
        model.addAttribute("client", profileService.findProfile(id));
        model.addAttribute("id", id);
        Gift gift = giftService.getOneGift(idGift);
        model.addAttribute("gift", gift);
        Store store = storeService.getOneStore(idGift);
        model.addAttribute("store", store);

        return "/orderData.jsp";
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        return "index.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6EBD0314
     */
    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String goToProfile(Principal principal, ModelMap model) {
        User user = userService.authUser(principal.getName());
        Integer id = user.getClient().getId();
        model.addAttribute("id", id);
        return "redirect:/{id}";
    }

    /**
     * @return String
     * @roseuid 565C6EC003A0
     */
    @RequestMapping(value = "/registrations", method = RequestMethod.POST)
    public String goToRegistration(@RequestParam("email") String login,
                                   @RequestParam("pass") String pass,
                                   @RequestParam("name") String name,
                                   @RequestParam("lastName") String lastName,
                                   ModelMap model) {
        UserDTO userDTO = new UserDTO(name, lastName, login);
        if (userService.authUser(login) != null) {
            model.addAttribute("user", userDTO);
            model.addAttribute("error", ERROR_LOGIN_MESSAGE);
            return "registration.jsp";
        }
        User user = userService.save(login, pass, "USER");
        profileService.save(name, lastName, user);
        model.addAttribute("msgSuccess", MSG_REGISTRATION_SUCCESS);
        return "authorization.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6ED60154
     */
    @RequestMapping(value = "/{id}/sendmessage", method = RequestMethod.GET)
    public String showMessages(@PathVariable Integer id, ModelMap model) {
        Profile client = profileService.findProfile(id);
        model.addAttribute("id", id);
        model.addAttribute("client", client);
        Set<Profile> friends = profileService.getFriends(id);
        model.addAttribute("friends", friends);
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "../message.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6EDF02B5
     */
    @RequestMapping(value = "/{id}/sendMessage", method = RequestMethod.POST)
    public String messanger(@PathVariable("id") Integer from,
                            @RequestParam("to") Integer to,
                            @RequestParam("title") String title,
                            @RequestParam("TextMessage") String text,
                            ModelMap model) {
        messageService.save(to, from, title, text, false);
        return "../sendMessSuccess.jsp";
    }


    /**
     * @return String
     * @roseuid 565C6EFB0050
     */
    @RequestMapping(value = "/{id}/message", method = RequestMethod.GET)
    public String getMessageShow(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("unreadMessDTO", messageService.geMessageDTOList(id, false));
        model.addAttribute("readMessDTO", messageService.geMessageDTOList(id, true));
        model.addAttribute("client", profileService.findProfile(id));
        model.addAttribute("id", id);
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "../messageShow.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6F070378
     */
    @RequestMapping(value = "/{id}/msgunread", method = RequestMethod.GET)
    public String getMessageUnreadShow(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("unreadMessDTO", messageService.geMessageDTOList(id, false));
        model.addAttribute("client", profileService.findProfile(id));
        model.addAttribute("id", id);
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "../messageShow.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6F1501F3
     */
    @RequestMapping(value = "/{id}/msgsent", method = RequestMethod.GET)
    public String getMessageSentShow(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("sentMessDTO", messageService.getSentMessageDTOList(id));
        model.addAttribute("client", profileService.findProfile(id));
        model.addAttribute("id", id);
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "../messageShow.jsp";
    }

    /**
     * @return String
     * @roseuid 565C6F1F020F
     */
    @RequestMapping(value = "/{id}/message/{msgId}", method = RequestMethod.GET)
    public String getMessageOne(@PathVariable Integer id, @PathVariable Integer msgId, ModelMap model) {
        Message msg = messageService.getMessage(msgId);

        if (msg.getStatus() == false && msg.getIdFrom() != id) {
            messageService.update(msg.getId());
        }
        model.addAttribute("msg", msg);
        model.addAttribute("client", profileService.findProfile(id));
        model.addAttribute("id", id);
        model.addAttribute("countMess", messageService.getCountUnread(id));
        return "../../messageFrom.jsp";
    }

    /**
     * @return String
     * @roseuid 565D794701A7
     */
    public String showOrder() {
        return null;
    }

    /**
     * @return String
     * @roseuid 565D795C0021
     */
    @RequestMapping(value = "/{id}/orderGift", method = RequestMethod.GET)
    public String showGifts(@PathVariable Integer id, ModelMap model) {
        Set<Gift> gifts = giftService.getGift();
        model.addAttribute("countMess", messageService.getCountUnread(id));
        model.addAttribute("client", profileService.findProfile(id));
        model.addAttribute("id", id);
        model.addAttribute("gifts", gifts);
        return "../orderGift.jsp";
    }

    /**
     * @return String
     * @roseuid 565D798A0175
     */
    @RequestMapping(value = "/{id}/pay/{idGift}", method = RequestMethod.POST)
    public String getOrder(@PathVariable("id") Integer id,
                           @PathVariable("idGift") Integer idGift,
                           @RequestParam("count") Integer count,
                           @RequestParam("number") String number,
                           @RequestParam("name") String name,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("month") String month,
                           @RequestParam("year") String year,
                           @RequestParam("cvv") Integer cvv,
                           ModelMap model) {
        model.addAttribute("countMess", messageService.getCountUnread(id));
        model.addAttribute("client", profileService.findProfile(id));
        model.addAttribute("id", id);
        Store store = storeService.getOneStore(idGift);
        Transaction transaction = storeService.addTransaction(store.getPrice()*count);
        storeService.addImplementsOrder(id,store.getId(),transaction.getId(), transaction.getSum());
        return "../../addGiftSuccess.jsp";
    }


    /**
     * @return String
     * @roseuid 565D79920387
     */
    public String searchOrder() {
        return null;
    }

    /**
     * @return String
     * @roseuid 565D7BF2030B
     */
    public String addNewUser() {
        return null;
    }

    /**
     * @return String
     * @roseuid 565D7C040171
     */
    @RequestMapping(value = "/{id}/orderVoice", method = RequestMethod.GET)
    public String orderingVoice(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("countMess", messageService.getCountUnread(id));
        model.addAttribute("client", profileService.findProfile(id));
        model.addAttribute("id", id);
        return "../orderData.jsp";
    }
}
