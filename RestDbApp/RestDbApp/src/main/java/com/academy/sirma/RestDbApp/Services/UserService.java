package com.academy.sirma.RestDbApp.Services;

import com.academy.sirma.RestDbApp.Models.User;
import com.academy.sirma.RestDbApp.Repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(User user){
        // TODO add some validations rules
        // password encrypt
        userRepository.saveUser(user);
    }
}
