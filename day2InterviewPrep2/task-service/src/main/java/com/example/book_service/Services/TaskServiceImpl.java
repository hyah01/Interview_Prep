package com.example.book_service.Services;

import com.example.book_service.Entities.Task;
import com.example.book_service.Repositories.TaskRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;
    @Override
    public Task addTask(Task task) {
        return this.taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return this.taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return this.taskRepository.findAll();
    }

    @Override
    public String deleteTask(ObjectId id) {
        Optional<Task> task = this.taskRepository.findById(id);
        if (task.isPresent()){
            this.taskRepository.deleteById(id);
            return "Deleted Successfully";
        } else {
            return "Delete Unsuccessfully, task don't exist";
        }
    }

    @Override
    public String checkBoxTask(ObjectId id) {
        Optional<Task> task = this.taskRepository.findById(id);
        if (task.isPresent()){
            Task newTask = task.get();
            newTask.setCompleted(!newTask.getCompleted());
            this.taskRepository.save(newTask);
            return "Task Completed: " + newTask.getCompleted();
        } else {
            return "Task don't exist";
        }
    }

    @Override
    public String assignTask(ObjectId id, String name) {
        Optional<Task> task = this.taskRepository.findById(id);
        if (task.isPresent()){
            Task newTask = task.get();
            if (!(newTask.getAssigned().contains(name))){
                List<String> updatedAssignedList = new ArrayList<>(newTask.getAssigned()); // Copy current list
                updatedAssignedList.add(name);
                newTask.setAssigned(updatedAssignedList);
                this.taskRepository.save(newTask);
                return "Assigned " + name + " to task";
            } else {
                return name + " already assigned";
            }

        } else {
            return "Task don't exist";
        }
    }

    @Override
    public String unAssignTask(ObjectId id, String name) {
        Optional<Task> task = this.taskRepository.findById(id);
        if (task.isPresent()){
            Task newTask = task.get();
            if (newTask.getAssigned().contains(name)){
                List<String> updatedAssignedList = new ArrayList<>(newTask.getAssigned()); // Copy current list
                updatedAssignedList.remove(name);
                newTask.setAssigned(updatedAssignedList);
                this.taskRepository.save(newTask);
                return "unassigned " + name + " from task";
            } else {
                return name + " isn't assigned";
            }

        } else {
            return "Task don't exist";
        }
    }

    @Override
    public String setPriority(ObjectId id, String priority) {
        Optional<Task> task = this.taskRepository.findById(id);
        if (task.isPresent()){
            Task newTask = task.get();
            newTask.setPriority(priority);
            this.taskRepository.save(newTask);
            return "Priority saved";

        } else {
            return "Task don't exist";
        }
    }
}
