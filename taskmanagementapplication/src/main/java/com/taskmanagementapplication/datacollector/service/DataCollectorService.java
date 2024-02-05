package com.taskmanagementapplication.datacollector.service;

import com.taskmanagementapplication.datacollector.model.TaskData;
import com.taskmanagementapplication.datacollector.model.UserData;

import java.util.List;

public interface DataCollectorService {
        List<TaskData> getAllTasks();
        List<UserData> getAllUsers();
}
