//Source file: D:\\9 ���\\����\\ClassDiagram\\MessageRepository.java

package by.home.repository;

import by.home.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

/**
 * @author Darya Kosik
 */
public interface MessageRepository extends JpaRepository<Message, Integer> {

   public ArrayList<Message> findByIdFromAndIdTo(Integer idFrom, Integer idTo);

   public ArrayList<Message> findByIdToOrderByDateDesc(Integer idTo);

   public ArrayList<Message> findByIdToAndStatusOrderByDateDesc(Integer idTo, Boolean status);

   public ArrayList<Message> findByIdFromOrderByDateDesc(Integer idFrom);

   public Long countByStatusAndIdTo(Boolean status, Integer id);
}
