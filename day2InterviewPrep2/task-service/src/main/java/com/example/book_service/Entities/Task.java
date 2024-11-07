package com.example.book_service.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date deadline;
    private Boolean completed;
    private List<String> assigned;

}
