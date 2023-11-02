package com.nikhil.learning.splitwise.services;

import com.nikhil.learning.splitwise.models.User;
import com.nikhil.learning.splitwise.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
