package com.Sys.Task_Managment_System_api.controller;

import com.Sys.Task_Managment_System_api.model.Task;
import com.Sys.Task_Managment_System_api.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/tasks")
public class TaskControllerWThymeleaf {

    private TaskService taskService;

    @Autowired
    public TaskControllerWThymeleaf(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getAllTasks(Model model){
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "task-list";
    }

    @GetMapping("/new")
    public String createTask(Model model){
        Task task = new Task();
        model.addAttribute("task", task);
        return "task-form";
    }

    @GetMapping("/edit/{id}")
    public String updateTask(Model model, @PathVariable Long id){
        Optional<Task> task = taskService.getTaskById(id);

        if(task.isPresent()){
            model.addAttribute("task", task.get());
        }else{
            return "redirect:/tasks";
        }
        return "task-form";
    }



}
