package com.example.MongoDbDemo.controller;

import com.example.MongoDbDemo.entity.Book;
import com.example.MongoDbDemo.entity.Task;
import com.example.MongoDbDemo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/save")
    public Task save(@RequestBody Task task){
      return taskService.addTask(task);
    }

    @GetMapping("/taskList")
    public List<Task> taskList(int id){
        return  taskService.getAllTaskList(id);
    }

    @GetMapping("/taskListBetBySevId")
    public List<Task> taskListbybetSevId(@RequestParam int min , @RequestParam int max){
        return  taskService.getAllTaskListbybetId(min , max);
    }

    @PostMapping("/save/book")
    public Book saveBook(@RequestBody Book book){
        return taskService.addBook(book);
    }
}
