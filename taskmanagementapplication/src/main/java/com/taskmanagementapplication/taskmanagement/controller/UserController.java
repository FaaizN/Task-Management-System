package com.taskmanagementapplication.taskmanagement.controller;

import com.taskmanagementapplication.taskmanagement.model.User;
import com.taskmanagementapplication.taskmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user){
        if (userService.existsByUsername(user.getUserName())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username already in use");
        }

        userService.saveUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

//    @PostMapping("/register")
//    public String register(@RequestBody User user) {
//        if (!user.getUserName().isEmpty()) {
//            return "Username already in use";
//        }
//        userService.saveUser(user);
//        return "User registered successfully";
//    }

}
