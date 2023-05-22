package com.example.MongoDbDemo.repo;

import com.example.MongoDbDemo.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface TaskRepo extends MongoRepository<Task,Integer> {

   /* @Query(value =" {'taskId' : ?0 }")
    List<Task> findAllByTaskId(String id);

    @Query(value = "{'severity' : {$gt : ?0 , $lt : ?1}}")
    List<Task> findAllBetweenSeverityId(int min ,int max);*/

    @Query(value = "{'id': ?0}" ,fields = "{taskTypes :0 }")
    List<Task> findAllByTaskId(int id);

    @Query(value = "{'severity': {$gt: ?0, $lt: ?1}}")
    List<Task> findAllBetweenSeverityId(int min, int max);
}
