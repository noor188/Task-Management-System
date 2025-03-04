//package com.Sys.Task_Managment_System_api.controller;
//
//
//import com.Sys.Task_Managment_System_api.model.Task;
//import com.Sys.Task_Managment_System_api.service.TaskService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/tasks")
//public class TaskController01 {
//
//
//    private final TaskService taskService;
//
//    @Autowired
//    public TaskController01(TaskService taskService){
//        this.taskService = taskService;
//    }
//
//    @GetMapping
//    public List<Task> getAllTasks(){
//        return taskService.getAllTasks();
//    }
//}
