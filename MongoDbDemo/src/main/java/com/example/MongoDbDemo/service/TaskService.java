package com.example.MongoDbDemo.service;

import com.example.MongoDbDemo.entity.Book;
import com.example.MongoDbDemo.entity.Task;
import com.example.MongoDbDemo.repo.BookRepo;
import com.example.MongoDbDemo.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {


    @Autowired
    private TaskRepo taskRepo;

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    public Task addTask(Task task){

        task.setId(sequenceGeneratorService.getSequenceNumber(Task.SEQUENCE_NAME));
        return taskRepo.save(task);
    }

    public List<Task> getAllTask(){
       return taskRepo.findAll();
    }
    public Task getByTaskId(int taskId){
        return taskRepo.findById(taskId).orElse(null);
    }

    public List<Task> getAllTaskList(int id) {

        List<Task> taskList = taskRepo.findAllByTaskId(id);
        return  taskList;
    }

    public List<Task> getAllTaskListbybetId(int min ,int max) {

        List<Task> taskList = taskRepo.findAllBetweenSeverityId(min,max);
        return  taskList;
    }

    public Book addBook(Book book) {
        book.setId(sequenceGeneratorService.getSequenceNumber(Book.SEQUENCE_NAME));
        return bookRepo.save(book);
    }
}
