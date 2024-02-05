package com.taskmanagementapplication.datacollector.controller;

import com.taskmanagementapplication.datacollector.model.TaskData;
import com.taskmanagementapplication.datacollector.model.UserData;
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
    public List<TaskData> getAllTasks() {
        return dataCollectorService.getAllTasks();
    }

    @GetMapping("/users")
    public List<UserData> getAllUsers() {
        return dataCollectorService.getAllUsers();
    }
}
