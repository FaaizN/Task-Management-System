package com.taskmanagementapplication.dataanalyzer.service;

import com.taskmanagementapplication.datacollector.model.TaskData;

import java.util.List;

public class DataAnalyzerServiceImplementation implements DataAnalyzerService{

    @Override
    public void analyzeTaskData(List<TaskData> taskDataList) {
        // Check to see whether the task has been completed
        taskDataList.forEach(status -> {
            boolean taskStatus = status.isCompleted();
        });
    }
}
