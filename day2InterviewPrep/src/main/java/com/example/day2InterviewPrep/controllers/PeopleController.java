package com.example.day2InterviewPrep.controllers;

import com.example.day2InterviewPrep.entities.People;
import com.example.day2InterviewPrep.service.PeopleService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @PostMapping("/add")
    public People addPeople(@RequestBody People people){
        return this.peopleService.addPeople(people);
    }
    @PutMapping("/update")
    public People updatePeople(@RequestBody People people){
        return this.peopleService.updatePeople(people);
    }
    @GetMapping("/all")
    public List<People> getAllPeople(){
        return this.peopleService.getAllPeople();
    }
    @DeleteMapping("/delete/{id}")
    public String deletePeople(@PathVariable ObjectId id){
        return this.peopleService.deletePeople(id);
    }
}
