package by.home.util.dto;

import by.home.entity.Message;
import lombok.Data;

/**
 * Created by DASHKA on 12.12.2015.
 */
@Data
public class MessageDTO {
    private  String nameFriend;

    private String lastNameFriend;

    private Message message;

    private Integer idFriend;

    public MessageDTO(String nameFriend, String lastNameFriend, Message message, Integer idFriend){
        this.nameFriend = nameFriend;
        this.lastNameFriend = lastNameFriend;
        this.message = message;
        this.idFriend = idFriend;
    }
}