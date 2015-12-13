//Source file: D:\\9 ���\\����\\ClassDiagram\\UserRepository.java

package by.home.repository;


import by.home.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

   public User findByLogin(String login);

}
