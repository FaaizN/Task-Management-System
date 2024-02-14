package com.taskmanagementapplication.datacollector.controller;

import com.taskmanagementapplication.taskmanagement.model.Task;
import com.taskmanagementapplication.taskmanagement.model.User;
import com.taskmanagementapplication.datacollector.service.DataCollectorService;
import com.taskmanagementapplication.taskmanagement.service.TaskService;
import com.taskmanagementapplication.taskmanagement.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataCollectorController {

    @Autowired
    private DataCollectorService dataCollectorService;

    @Autowired
    private UserService userService;

    @Autowired
    private TaskService taskService;
    /*@GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return dataCollectorService.getAllTasks();
    }*/

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getUserTasks(@RequestParam String userName){
        // Check to see if the user exists
        User user = userService.getUserByUserName(userName);
        if(user != null) {
            // Get the task associated with the user
            List<Task> userTasks = taskService.getTasksByUser(user);
            return ResponseEntity.ok(userTasks);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }


    /*// Add a task to the database
    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody Task task, @RequestParam String userName){
        // Check to see username exists
        User user = userService.getUserByUserName(userName);
        if(user != null) {
            // Associate task with the retrieved user
            task.setUser(user);

            // Save the task
            taskService.saveTask(task);

            return ResponseEntity.ok("Task Created Successfully");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username");
        }
    }*/








    @GetMapping("/users")
    public List<User> getAllUsers() {
        return dataCollectorService.getAllUsers();
    }

    @GetMapping("/check/{userName}")
    public ResponseEntity<String> checkUserName(@PathVariable String userName) {
        if (dataCollectorService.doesUsernameExist(userName)) {
            return ResponseEntity.status(HttpStatus.OK).body("Username exists");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Username does not exist");
        }
    }
}
