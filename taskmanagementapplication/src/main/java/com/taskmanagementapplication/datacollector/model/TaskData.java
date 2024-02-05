package com.taskmanagementapplication.datacollector.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="task")
public class TaskData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskID;
    private String taskName;
    private Date dueDate;
    private boolean completed;

    public TaskData() {
    }

    public int getId() {
        return taskID;
    }

    public void setId(int id) {
        this.taskID = id;
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
