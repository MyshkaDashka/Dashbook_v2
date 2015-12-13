//Source file: D:\\9 ���\\����\\ClassDiagram\\ProfileFriendRepository.java

package by.home.repository;

import by.home.entity.Profile_Friend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ProfileFriendRepository  extends JpaRepository<Profile_Friend, Integer>
{

   /**
    * @return java.util.ArrayList
    * @roseuid 565D5BE0027B
    */
   public ArrayList<Profile_Friend> findByIdProfile(Integer idClient);
   
   /**
    * @return ClassDiagram.Profile_Friend
    * @roseuid 565D5BF301F8
    */
   public Profile_Friend findByIdProfileAndIdFriend(Integer idClient, Integer idFriend);
}
