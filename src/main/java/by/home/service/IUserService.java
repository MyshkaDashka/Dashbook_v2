//Source file: D:\\9 ���\\����\\ClassDiagram\\IUserService.java

package by.home.service;


import by.home.entity.User;

public interface IUserService
{
   
   /**
    * @return ClassDiagram.User
    * @roseuid 565C640D037F
    */
   public User save(String login, String pass, String role);

   public User authUser(String login);
}
