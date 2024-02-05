package com.taskmanagementapplication.taskmanagement.repository;

import com.taskmanagementapplication.taskmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
