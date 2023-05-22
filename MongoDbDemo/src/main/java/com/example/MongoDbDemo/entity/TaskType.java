package com.example.MongoDbDemo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "task_type")
@Getter
@Setter
public class TaskType {

    @Id
    private Integer taskId;

    private String description;

}
