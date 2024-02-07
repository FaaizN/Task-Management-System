package com.taskmanagementapplication.taskmanagement.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Task {

    // Set ID as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskID;
    private String taskName;
    private Date dueDate;
    private boolean completed;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Task() {
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
