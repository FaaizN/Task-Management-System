package com.taskmanagementapplication.datacollector.repository;

import com.taskmanagementapplication.datacollector.model.TaskData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDataRepository extends JpaRepository<TaskData, Integer> {
}
