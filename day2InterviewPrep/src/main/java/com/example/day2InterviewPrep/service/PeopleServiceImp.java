package com.example.day2InterviewPrep.service;

import com.example.day2InterviewPrep.entities.People;
import com.example.day2InterviewPrep.repository.PeopleRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PeopleServiceImp implements PeopleService{

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    public People addPeople(People people){
        return this.peopleRepository.save(people);
    }

    @Override
    public People updatePeople(People people) {
        return this.peopleRepository.save(people);
    }

    @Override
    public List<People> getAllPeople() {
        return this.peopleRepository.findAll();
    }

    @Override
    public String deletePeople(ObjectId id) {
        Optional person = this.peopleRepository.findById(id);
        if (person.isPresent()){
            this.peopleRepository.deleteById(id);
            return "Deleted Successfully";
        } else {
            return "Delete Unsuccessfully, person don't exist";
        }

    }
}
