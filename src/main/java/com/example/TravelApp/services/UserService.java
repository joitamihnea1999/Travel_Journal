package com.example.TravelApp.services;

import com.example.TravelApp.entities.user.User;
import com.example.TravelApp.entities.user.UserByEmail;
import com.example.TravelApp.entities.user.UserByUsername;
import com.example.TravelApp.repositories.UserByEmailRepository;
import com.example.TravelApp.repositories.UserByUsernameRepository;
import com.example.TravelApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserByEmailRepository userByEmailRepository;
    @Autowired
    private UserByUsernameRepository userByUsernameRepository;

    public boolean insertUser(User user) {
        // Check for uniqueness of email and username
        if(userByEmailRepository.existsById(user.getEmail()) || userByUsernameRepository.existsById(user.getUsername())) {
            return false;
        }

        // Insert into all tables
        userRepository.save(user);
        userByEmailRepository.save(new UserByEmail(user.getEmail(), user.getUuid()));
        userByUsernameRepository.save(new UserByUsername(user.getUsername(), user.getUuid()));

        return true;
    }
}
