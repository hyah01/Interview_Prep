package com.example.day2InterviewPrep.entities;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class People {
    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String phoneNumber;
    private Integer ssn;
    private String gender;
    private Address address;

}
