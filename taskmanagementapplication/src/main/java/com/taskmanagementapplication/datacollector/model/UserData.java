package com.taskmanagementapplication.datacollector.model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;
    private String name;

    public UserData() {
    }

    public long getUserDataID() {
        return userID;
    }

    public void setUserDataID(long userDataID) {
        this.userID = userDataID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
