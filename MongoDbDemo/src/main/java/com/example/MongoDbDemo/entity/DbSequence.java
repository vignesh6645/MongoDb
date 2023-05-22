package com.example.MongoDbDemo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document(collection = "db_sequence")
public class DbSequence {

    @Id
    private String  id;
    private int seq;

}
