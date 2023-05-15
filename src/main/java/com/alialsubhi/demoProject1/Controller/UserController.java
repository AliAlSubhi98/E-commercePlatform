package com.alialsubhi.demoProject1.Controller;

import com.alialsubhi.demoProject1.Models.ShoppingCart;
import com.alialsubhi.demoProject1.Models.User;
import com.alialsubhi.demoProject1.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="User")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
