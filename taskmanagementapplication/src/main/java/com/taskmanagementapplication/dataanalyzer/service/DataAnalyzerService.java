package com.taskmanagementapplication.dataanalyzer.service;

import com.taskmanagementapplication.datacollector.model.TaskData;
import com.taskmanagementapplication.datacollector.model.UserData;

import java.util.List;

public interface DataAnalyzerService {
    void analyzeTaskData(List<TaskData> taskDataList);

}
