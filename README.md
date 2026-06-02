# Task App

A full-stack Task Management application built with React, TypeScript, Spring Boot, and PostgreSQL.
Users can create task lists, add tasks, update task details, track task status, and manage priorities through a modern web interface.

---

## Features

### Task Lists
- Create task lists
- View all task lists
- Update task lists
- Delete task lists

### Tasks
- Create tasks inside a task list
- View tasks for a specific task list
- Update task details
- Delete tasks
- Assign priorities (HIGH, MEDIUM, LOW)
- Track task status
  
---

## Tech Stack

### Frontend

- React
- TypeScript
- Vite
- Axios
- React Router

### Backend

- Java 
- Spring Boot
- Spring Data JPA
- Maven

### Database

- PostgreSQL

---

## API Endpoints

### Task Lists

| Method | Endpoint | Description |
|----------|------------|------------|
| GET | `/task-lists` | Get all task lists |
| POST | `/task-lists` | Create task list |
| GET | `/task-lists/{taskListId}` | Get task list |
| PUT | `/task-lists/{taskListId}` | Update task list |
| DELETE | `/task-lists/{taskListId}` | Delete task list |

### Tasks

| Method | Endpoint | Description |
|----------|------------|------------|
| GET | `/task-lists/{taskListId}/tasks` | Get all tasks |
| POST | `/task-lists/{taskListId}/tasks` | Create task |
| GET | `/task-lists/{taskListId}/tasks/{taskId}` | Get task |
| PUT | `/task-lists/{taskListId}/tasks/{taskId}` | Update task |
| DELETE | `/task-lists/{taskListId}/tasks/{taskId}` | Delete task |

---

## Future Improvements

- User authentication with JWT
- Role-based authorization
- Search tasks
- Task due dates
- Task categories
- Docker deployment
- CI/CD pipeline
- Cloud deployment
