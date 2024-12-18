package com.puttstat.model.dto;

public class UserDTO {

    private final String username;

    private final String email;

    private final String password;

    public UserDTO(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

}
