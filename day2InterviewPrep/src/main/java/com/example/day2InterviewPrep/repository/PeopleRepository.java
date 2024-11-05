package com.example.day2InterviewPrep.repository;

import com.example.day2InterviewPrep.entities.People;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends MongoRepository<People, ObjectId> {
}
