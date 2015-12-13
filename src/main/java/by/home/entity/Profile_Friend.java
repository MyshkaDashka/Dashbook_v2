//Source file: D:\\9 ���\\����\\ClassDiagram\\Profile_Friend.java

package by.home.entity;

import lombok.Data;

import javax.persistence.*;

@Entity

public class Profile_Friend 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   private Integer id;

   @Column(nullable = false)
   private Integer idProfile;

   @Column(nullable = false)
   private Integer idFriend;
   
   /**
    * @roseuid 5669EDEC027F
    */
   public Profile_Friend() 
   {
    
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getIdProfile() {
      return idProfile;
   }

   public void setIdProfile(Integer idProfile) {
      this.idProfile = idProfile;
   }

   public Integer getIdFriend() {
      return idFriend;
   }

   public void setIdFriend(Integer idFriend) {
      this.idFriend = idFriend;
   }
}
