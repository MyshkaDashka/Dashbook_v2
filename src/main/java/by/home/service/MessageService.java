//Source file: D:\\9 ���\\����\\ClassDiagram\\MessageService.java

package by.home.service;

import by.home.entity.Message;
import by.home.entity.Profile;
import by.home.repository.MessageRepository;
import by.home.repository.ProfileRepository;
import by.home.util.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Darya Kosik
 */
@Service
public class MessageService implements IMessageService
{
   @Autowired
   private MessageRepository messageRepository;
   @Autowired
   private ProfileRepository profileRepository;

   /**
    * @roseuid 5669EDEA03D5
    */
   @Transactional
   public Message save(Integer to, Integer from, String title, String text, Boolean status) {
      Message message = new Message();
      message.setIdTo(to);
      message.setIdFrom(from);
      message.setTitle(title);
      message.setText(text);
      long curTime = System.currentTimeMillis();
      Date curDate = new Date(curTime);
      message.setDate(curDate);
      message.setStatus(status);
      return messageRepository.save(message);
   }

   @Transactional
   public Message update(Integer idMess) {
      Message message = messageRepository.findOne(idMess);
      message.setIdTo(message.getIdTo());
      message.setIdFrom(message.getIdFrom());
      message.setTitle(message.getTitle());
      message.setText(message.getText());
      message.setDate(message.getDate());
      message.setStatus(true);
      return messageRepository.save(message);
   }


   @Transactional
   public ArrayList<MessageDTO> geMessageDTOList(Integer idClient, Boolean status) {
      ArrayList<Message> messagesList = messageRepository.findByIdToAndStatusOrderByDateDesc(idClient, status);
      ArrayList<MessageDTO> messageDTOList = new ArrayList<MessageDTO>();
      for (Message msg : messagesList) {
         Profile client = profileRepository.getOne(msg.getIdFrom());
         MessageDTO messageDTO = new MessageDTO(client.getName(), client.getLastName(), msg, client.getId());
         messageDTOList.add(messageDTO);
      }
      return messageDTOList;
   }

   @Transactional
   public ArrayList<MessageDTO> getSentMessageDTOList(Integer idClient) {
      ArrayList<Message> messagesList = messageRepository.findByIdFromOrderByDateDesc(idClient);
      ArrayList<MessageDTO> messageDTOList = new ArrayList<MessageDTO>();
      for (Message msg : messagesList) {
         Profile client = profileRepository.getOne(msg.getIdTo());
         MessageDTO messageDTO = new MessageDTO(client.getName(), client.getLastName(), msg, client.getId());
         messageDTOList.add(messageDTO);
      }
      return messageDTOList;
   }

   @Transactional
   public Message getMessage(Integer id) {
      Message message = messageRepository.findOne(id);
      return message;
   }

   @Transactional
   public Long getCountUnread(Integer id) {
      Long count = messageRepository.countByStatusAndIdTo(false, id);
      if (count == 0) {
         return null;
      } else {
         return count;
      }
   }
}
