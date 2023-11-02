package com.nikhil.learning.splitwise.commands;

import com.nikhil.learning.splitwise.controllers.UserController;
import com.nikhil.learning.splitwise.dtos.CreateUserDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Component
@AllArgsConstructor
public class CreateUserCommand implements Command{

    private UserController userController;
    @Override
    public boolean matches(String input) {
        return getCommand(input).equals(CommandsList.REGISTER_USER_COMMAND);
    }

    @Override
    public void execute(String input) {
        //call user controller
        List<String> tokens = getTokens(input);
        CreateUserDTO createUserDTO = CreateUserDTO.builder()
                .name(tokens.get(1))
                .email(tokens.get(2))
                .phoneNumber(tokens.get(3))
                .password(tokens.get(4))
                .build();

        userController.createUser(createUserDTO);
    }
}
