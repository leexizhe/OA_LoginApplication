package com.uob.loginregister.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRegistrationDto {
    private String username;
    private String password;
    private String role;

    public UserRegistrationDto() {}
}
