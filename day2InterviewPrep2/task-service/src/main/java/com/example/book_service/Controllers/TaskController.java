package com.example.book_service.Controllers;

import com.example.book_service.Entities.Task;
import com.example.book_service.Services.TaskService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public Task addTask(@RequestBody Task task){
        return this.taskService.addTask(task);
    }

    @PutMapping("/update")
    public Task updateTask(@RequestBody Task task){
        return this.taskService.addTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable ObjectId id){
        return this.taskService.deleteTask(id);
    }

    @GetMapping("/getAllTask")
    public List<Task> getAllTasks(){
        return this.taskService.getAllTasks();
    }


}
