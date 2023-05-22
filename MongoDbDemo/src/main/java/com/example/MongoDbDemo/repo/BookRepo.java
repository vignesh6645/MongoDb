package com.example.MongoDbDemo.repo;

import com.example.MongoDbDemo.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book,Integer> {
}
