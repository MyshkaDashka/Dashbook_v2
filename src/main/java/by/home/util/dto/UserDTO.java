package by.home.util.dto;

import lombok.Data;

/**
 * Created by DASHKA on 12.12.2015.
 */
@Data
public class UserDTO {

    private String name;

    private String lastName;

    private String login;

    public UserDTO(String name, String lastName, String login){
        this.name = name;
        this.lastName = lastName;
        this.login = login;
    }
}