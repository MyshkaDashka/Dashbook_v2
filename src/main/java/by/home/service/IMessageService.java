package by.home.service;

import by.home.entity.Message;
import by.home.util.dto.MessageDTO;

import java.util.ArrayList;

/**
 * Created by DASHKA on 12.12.2015.
 */
public interface IMessageService {

    public Message save(Integer to, Integer from, String title, String text, Boolean status);

    public ArrayList<MessageDTO> getSentMessageDTOList(Integer idClient);

    public ArrayList<MessageDTO> geMessageDTOList(Integer idClient, Boolean status);

    public Message getMessage(Integer id);

    public Message update(Integer idMess);

    public Long getCountUnread(Integer id);
}
