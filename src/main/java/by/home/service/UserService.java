//Source file: D:\\9 ���\\����\\ClassDiagram\\UserService.java

package by.home.service;


import by.home.entity.User;
import by.home.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Darya Kosik
 */
@Service
public class UserService implements IUserService 
{
   @Autowired
   private UserRepository userRepository;


   @Transactional
   public User save(String login, String pass, String role) {
      User user = new User();
      user.setLogin(login);
      user.setPassword(pass);
      user.setRole(role);
      return userRepository.save(user);
   }


   @Transactional
   public User authUser(String login) {
      return userRepository.findByLogin(login);
   }
}
