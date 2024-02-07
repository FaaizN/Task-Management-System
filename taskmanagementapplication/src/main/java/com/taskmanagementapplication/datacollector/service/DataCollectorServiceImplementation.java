package com.taskmanagementapplication.datacollector.service;

import com.taskmanagementapplication.datacollector.model.TaskData;
import com.taskmanagementapplication.datacollector.model.UserData;
import com.taskmanagementapplication.datacollector.repository.TaskDataRepository;
import com.taskmanagementapplication.datacollector.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

@Service
public class DataCollectorServiceImplementation implements  DataCollectorService{

    @Autowired
    private TaskDataRepository taskDataRepository;

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public List<TaskData> getAllTasks() {
        List<TaskData> allTasks = taskDataRepository.findAll();
        allTasks.forEach(task -> {
            // Filter the names for null values
            if (task.getTaskName() == null) {
                // Set the default value
                task.setTaskName("Default");
            }

            // Filter the Date for null values
            if (task.getDueDate() == null) {
                // Create Date
                Date currentDate = Calendar.getInstance().getTime();

                // Format the date to "YYYY-MM-DD" format
                SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
                String formattedDate = dateFormat.format(currentDate);
                try {
                    Date date = dateFormat.parse(formattedDate);
                    task.setDueDate(date);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return allTasks;
    }

    @Override
    public List<UserData> getAllUsers() {
        List<UserData> allUsers = userDataRepository.findAll();
        allUsers.forEach(user ->{
            // Filter the name for null values
            if (user.getName() == null){
                // Set the default value
                user.setName("NA");
            }
        });
        return allUsers;
    }
}
