package com.taskmanagementapplication.taskmanagement.service;

import com.taskmanagementapplication.taskmanagement.model.User;

public interface UserService {
    boolean existsByUsername(String userName);
    public User saveUser(User user);

}
