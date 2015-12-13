//Source file: D:\\9 ���\\����\\ClassDiagram\\IProfileService.java

package by.home.service;

import by.home.entity.Profile;
import by.home.entity.User;
import org.springframework.security.access.method.P;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

/**
 * @author Darya Kosik
 */
public interface IProfileService 
{

   /**
    * @return ClassDiagram.Profile
    * @roseuid 565C52CE0213
    */
   public Profile findProfile(Integer id);
   
   /**
    * @return java.util.HashSet
    * @roseuid 565C530D0396
    */
   public Set<Profile> getFriends(Integer id);
   
   /**
    * @return ClassDiagram.Profile
    * @roseuid 565C533002BE
    */
   public Profile save(String name, String lastName, User user);
   
   /**
    * @roseuid 565C53510067
    */
   public void addFriend(Integer clientId, Integer friendId);
   
   /**
    * @return ClassDiagram.Profile
    * @roseuid 565C536C00D0
    */
   public Profile update(Integer id, String city, String birthday, String phone, String study, String work, String about);
   
   /**
    * @return Boolean
    * @roseuid 565C545002D7
    */
   public Boolean checkFriendAdd(Integer idClient, Integer idFriend);
   
   /**
    * @roseuid 565C545F033C
    */
   public void removeFriend(Integer clientId, Integer friendId);
   
   /**
    * @return java.util.ArrayList
    * @roseuid 565C548902D7
    */
   public ArrayList<Profile> search(String name, String lastName, String city, String study, String work);
}
