package com.taskmanagementapplication.datacollector.repository;

import com.taskmanagementapplication.datacollector.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, Integer> {
}
