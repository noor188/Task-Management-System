---

### *Task Management System*

---

#### **Ticket 1: Set Up Spring Boot Project**

- **Tasks:**
  1. **Created a new Spring Boot project**     
  2. **Initialized version control**
  3. **Configured MySQL in `application.properties`**    
  4. **Created the MySQL database**
   
---

#### **Ticket 2: Create the `Task` Entity**

- **Tasks:**
  - Created the `Task` entity class.
  - Annotated the class with `@Entity` to map it to the database.
  - Used appropriate JPA annotations like `@Id` and `@GeneratedValue` for the primary key.

---

#### **Ticket 3: Create the `TaskRepository` Interface**

- **Tasks:**
  - Created a repository interface by extending `JpaRepository<Task, Long>` to automatically generate CRUD operations for the `Task` entity.
  - This interface handles database operations like saving, updating, finding, and deleting tasks without requiring manual SQL queries.

---

#### **Ticket 4: Create the `TaskService` Class**

- **Tasks:**
  - Created a service class (`TaskService`) to implement the business logic for managing tasks.
  - Implemented the following methods:
    - `getAllTasks()` to fetch all tasks from the repository.
    - `getTaskById(Long id)` to retrieve a task by its ID.
    - `createTask(Task task)` to create and save a new task.
    - `updateTask(Long id, Task updatedTask)` to update an existing task.    
    - `deleteTask(Long id)` to delete a task.

---

#### **Ticket 5: Create the `TaskController` Class**

- **Tasks:**
  - Created a REST controller (`TaskController`) to expose task management functionality through HTTP endpoints.
  - Implemented the following endpoints:
    - **GET** `/api/tasks` to retrieve all tasks.
    - **GET** `/api/tasks/{id}` to retrieve a specific task by its ID.
    - **POST** `/api/tasks` to create a new task.
    - **PUT** `/api/tasks/{id}` to update an existing task by ID.     
    - **DELETE** `/api/tasks/{id}` to delete a task by ID.
  - Used `@GetMapping`, `@PostMapping`, `@PutMapping`, and `@DeleteMapping` for handling HTTP requests.

---
