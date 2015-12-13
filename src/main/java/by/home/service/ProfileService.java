//Source file: D:\\9 ���\\����\\ClassDiagram\\ProfileService.java

package by.home.service;

import by.home.entity.Profile;
import by.home.entity.Profile_Friend;
import by.home.entity.User;
import by.home.repository.ProfileFriendRepository;
import by.home.repository.ProfileRepository;
import by.home.repository.ProfileSpec;
import by.home.repository.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Darya Kosik
 */
@Service
public class ProfileService implements IProfileService
{
   @Autowired
   private ProfileRepository profileRepository;
   @Autowired
   private ProfileFriendRepository  profileFriendRepository;

   @Transactional
   public Profile findProfile(Integer id) {
      Profile client = profileRepository.findOne(id);
      return client;
   }

   @Transactional
   public Set<Profile> getFriends(Integer id) {
      ArrayList<Profile_Friend> client_friendLists = profileFriendRepository.findByIdProfile(id);
      Set<Profile> friends = new HashSet<Profile>();
      for (Profile_Friend cf : client_friendLists) {
         friends.add(profileRepository.findOne(cf.getIdFriend()));
      }
      return friends;
   }

   @Transactional
   public Profile save(String name, String lastName, User user) {
      Profile client = new Profile();
      client.setName(name);
      client.setLastName(lastName);
      client.setUser(user);
      client.setStudy("");
      client.setCity("");
      client.setWork("");
      client.setPhoto("img/avatars/avatar.jpg");
      return profileRepository.save(client);
   }

   @Transactional
   public Profile update(Integer id, String city, String birthday, String phone, String study, String work, String about) {
      Profile client = profileRepository.findOne(id);
      client.setCity(city);
      client.setBirthday(birthday);
      client.setPhone(phone);
      client.setStudy(study);
      client.setWork(work);
      client.setAboutMe(about);
      return profileRepository.save(client);
   }

   @Transactional
   public void addFriend(Integer clientId, Integer friendId) {
      Profile_Friend cf = new Profile_Friend();
      cf.setIdProfile(clientId);
      cf.setIdFriend(friendId);
      profileFriendRepository.save(cf);
   }

   @Transactional
   public Boolean checkFriendAdd(Integer idClient, Integer idFriend) {
      if (profileFriendRepository.findByIdProfileAndIdFriend(idClient, idFriend) == null) {
         return false;
      } else {
         return true;
      }
   }

   @Transactional
   public void removeFriend(Integer clientId, Integer friendId) {
      Profile_Friend cf = profileFriendRepository.findByIdProfileAndIdFriend(clientId, friendId);
      profileFriendRepository.delete(cf);
   }

   @Transactional
   public ArrayList<Profile> search(String name, String lastName, String city, String study, String work) {
      ProfileSpec specName = new ProfileSpec(new SearchCriteria("name", ":", name));
      ProfileSpec specLastName = new ProfileSpec(new SearchCriteria("lastName", ":", lastName));
      ProfileSpec specCity = new ProfileSpec(new SearchCriteria("city", ":", city));
      ProfileSpec specStudy = new ProfileSpec(new SearchCriteria("study", ":", study));
      ProfileSpec specWork = new ProfileSpec(new SearchCriteria("work", ":", work));
      List<Profile> result = profileRepository.findAll(Specifications.where(specName).and(specLastName).and(specCity).and(specStudy).and(specWork));
      ArrayList<Profile> res =new  ArrayList<Profile>();
      res.addAll(result);
      return res;

   }}
