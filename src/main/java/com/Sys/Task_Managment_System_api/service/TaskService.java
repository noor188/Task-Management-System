package com.Sys.Task_Managment_System_api.service;

import com.Sys.Task_Managment_System_api.model.Task;
import com.Sys.Task_Managment_System_api.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);
    }

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task updateTask){
//        Optional<Task> task = taskRepository.findById(id);
//        if (task.isPresent()){
//            Task oldTask = task.get();
//            oldTask.setTitle(updateTask.getTitle());
//            oldTask.setDescription(updateTask.getDescription());
//            oldTask.setTitle(updateTask.getTitle());
//            return taskRepository.save(oldTask);
//        }else {
//            throw new RuntimeException("Task not found!!!")
//        }
        return taskRepository.findById(id)
                .map(task -> {
                    task.setTitle(updateTask.getTitle());
                    task.setDescription(updateTask.getDescription());
                    task.setStatus(updateTask.getStatus());
                    return taskRepository.save(task);
                })
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
