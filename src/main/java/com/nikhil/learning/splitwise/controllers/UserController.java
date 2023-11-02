package com.nikhil.learning.splitwise.controllers;

import com.nikhil.learning.splitwise.dtos.CreateUserDTO;
import com.nikhil.learning.splitwise.models.User;
import com.nikhil.learning.splitwise.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController {

    private UserService userService;
    public User createUser(CreateUserDTO request){
        return userService.createUser(request.toUser());
    }
}
