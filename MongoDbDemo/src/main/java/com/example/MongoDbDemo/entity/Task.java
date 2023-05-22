package com.example.MongoDbDemo.entity;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "task")
@Getter
@Setter
public class Task {

    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";

    @Id
    private Integer id;

    private String description;

    private int severity;

    private String person;

    private  int storyPoint;

    private TaskType taskTypes;


}
