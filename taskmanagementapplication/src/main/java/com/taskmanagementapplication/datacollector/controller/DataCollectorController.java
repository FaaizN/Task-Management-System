package com.taskmanagementapplication.datacollector.controller;

import com.taskmanagementapplication.taskmanagement.model.Task;
import com.taskmanagementapplication.taskmanagement.model.User;
import com.taskmanagementapplication.datacollector.service.DataCollectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataCollectorController {

    @Autowired
    private DataCollectorService dataCollectorService;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return dataCollectorService.getAllTasks();
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return dataCollectorService.getAllUsers();
    }
}
