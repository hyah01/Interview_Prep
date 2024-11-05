package com.example.book_service.Services;


import com.example.book_service.Entities.Task;
import org.bson.types.ObjectId;

import java.util.List;

public interface TaskService {
    Task addTask(Task task);
    Task updateTask(Task task);
    List<Task> getAllTasks();
    String deleteTask(ObjectId id);
    String checkBoxTask(ObjectId id);
    String assignTask(ObjectId id, String name);
    String unAssignTask(ObjectId id, String name);
    String setPriority(ObjectId id, String priority);




}
