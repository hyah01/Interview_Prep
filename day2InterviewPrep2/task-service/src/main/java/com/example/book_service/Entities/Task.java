package com.example.book_service.Entities;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class Task {
    @Id
    private ObjectId id;
    private String taskName;
    private String taskDescription;
    private String priority;
    private Date deadline;
    private Boolean completed;
    private List<String> assigned;

}
