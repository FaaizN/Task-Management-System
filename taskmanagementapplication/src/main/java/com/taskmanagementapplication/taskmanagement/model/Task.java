package com.taskmanagementapplication.taskmanagement.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Task {

    // Set ID as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private int task_id;
    private String taskName;
    private Date dueDate;
    private boolean completed;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User owner;

    public Task() {
    }

    public int getTaskID() {
        return task_id;
    }

    public void setTaskID(int taskID) {
        this.task_id = taskID;
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
