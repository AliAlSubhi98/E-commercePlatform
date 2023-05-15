package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.User;
import com.alialsubhi.demoProject1.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
