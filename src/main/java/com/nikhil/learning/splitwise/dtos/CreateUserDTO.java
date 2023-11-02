package com.nikhil.learning.splitwise.dtos;

import com.nikhil.learning.splitwise.models.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserDTO {
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    public User toUser() {
        return User.builder()
                .name(name)
                .email(email)
                .phoneNumber(phoneNumber)
                .password(password)
                .build();
    }
}
