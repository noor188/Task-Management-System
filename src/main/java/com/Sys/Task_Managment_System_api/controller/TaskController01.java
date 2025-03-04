//package com.Sys.Task_Managment_System_api.controller;
//
//
//import com.Sys.Task_Managment_System_api.model.Task;
//import com.Sys.Task_Managment_System_api.service.TaskService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Optional;
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
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Task> getTaskbyId(@PathVariable Long id){
//        return taskService.getTaskById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//}
