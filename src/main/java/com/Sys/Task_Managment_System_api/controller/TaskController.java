//package com.Sys.Task_Managment_System_api.controller;
//
//
//import com.Sys.Task_Managment_System_api.model.Task;
//import com.Sys.Task_Managment_System_api.service.TaskService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/tasks")
//public class TaskController {
//
//    private final TaskService taskService;
//
//    @Autowired
//    public TaskController(TaskService taskService) {
//        this.taskService = taskService;
//    }
//
//    @GetMapping
//    public List<Task> getAllTasks(){
//        return taskService.getAllTasks();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Task> getTaskById(@PathVariable Long id){
//        return taskService.getTaskById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public Task createTask(@RequestBody Task task){
//        return taskService.createTask(task);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task){
//        try{
//            Task updatedTask = taskService.updateTask(id, task);
//            return ResponseEntity.ok(updatedTask);
//        }catch(RuntimeException e){
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Task> deleteTask(@PathVariable Long id){
//        taskService.deleteTask(id);
//        return ResponseEntity.noContent().build();
//    }
//}
//
//
