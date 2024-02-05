package com.taskmanagementapplication.taskmanagement.controller;

import com.taskmanagementapplication.taskmanagement.model.Task;
import com.taskmanagementapplication.taskmanagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public String add(@RequestBody Task task){
        taskService.saveUser(task);
        return "New task is added";
    }
}
