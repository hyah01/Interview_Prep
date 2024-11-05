package com.example.day2InterviewPrep.service;

import com.example.day2InterviewPrep.entities.People;
import org.bson.types.ObjectId;

import java.util.List;

public interface PeopleService {
    People addPeople(People people);

    People updatePeople(People people);

    List<People> getAllPeople();

    String deletePeople(ObjectId id);
}
