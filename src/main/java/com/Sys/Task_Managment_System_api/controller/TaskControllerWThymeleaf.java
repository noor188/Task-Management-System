package com.Sys.Task_Managment_System_api.controller;

import com.Sys.Task_Managment_System_api.model.Task;
import com.Sys.Task_Managment_System_api.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Slf4j
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
        log.info("Fetching all tasks");
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "task-list";
    }

    @GetMapping("/new")
    public String showCreateTaskForm(Model model){
        log.info("Displaying task creation form");
        Task task = new Task();
        model.addAttribute("task", task);
        return "task-form";
    }

    @GetMapping("/edit/{id}")
    public String showEditTaskForm(Model model, @PathVariable Long id){
        log.info("Fetching task with ID: {}", id);
        Optional<Task> task = taskService.getTaskById(id);

        if(task.isPresent()){
            model.addAttribute("task", task.get());
            log.info("Task found: {}", task.get());
        }else{
            log.warn("Task with ID: {} not found", id);
            return "redirect:/tasks";
        }
        return "task-form";
    }

    @PostMapping("/save")
    public String saveTask(@ModelAttribute("task") Task task){
        if (task.getId() != null){
            taskService.updateTask(task.getId(), task);
            log.info("Creating new Task: {}", task);
        }else{
            taskService.createTask(task);
        }
        return "redirect:/tasks";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id){
        log.info("Deleting task with ID: {}", id);
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
}
