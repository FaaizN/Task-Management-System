package com.taskmanagementapplication.datacollector.service;

import com.taskmanagementapplication.datacollector.model.TaskData;
import com.taskmanagementapplication.datacollector.model.UserData;
import com.taskmanagementapplication.datacollector.repository.TaskDataRepository;
import com.taskmanagementapplication.datacollector.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataCollectorServiceImplementation implements  DataCollectorService{

    @Autowired
    private TaskDataRepository taskDataRepository;

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public List<TaskData> getAllTasks() {
        return taskDataRepository.findAll();
    }

    @Override
    public List<UserData> getAllUsers() {
        return userDataRepository.findAll();
    }
}
