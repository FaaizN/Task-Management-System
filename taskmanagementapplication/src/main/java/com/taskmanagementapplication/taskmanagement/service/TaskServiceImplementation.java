package com.taskmanagementapplication.taskmanagement.service;

import com.taskmanagementapplication.taskmanagement.model.Task;
import com.taskmanagementapplication.taskmanagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImplementation implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task saveUser(Task task) {
        return null;
    }
}
