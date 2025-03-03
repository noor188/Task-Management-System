package com.Sys.Task_Managment_System_api.repository;

import com.Sys.Task_Managment_System_api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
