//Source file: D:\\9 ���\\����\\ClassDiagram\\User.java

package by.home.entity;

import lombok.Data;

import javax.persistence.*;

@Entity

public class User 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   private Integer id;

   @Column(nullable = false)
   private String login;

   @Column(nullable = false)
   private String password;

   @Column(nullable = false)
   private String role;

   @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
   private Profile client;
   
   /**
    * @roseuid 5669EDED0019
    */
   public User() 
   {
    
   }

   public Profile getClient() {
      return client;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public void setClient(Profile client) {
      this.client = client;
   }
}
