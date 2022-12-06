package com.example.courseappbackend.controller;

import com.example.courseappbackend.model.Courses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @PostMapping(path = "/add",consumes = "application/json", produces = "application/json")
    public String AddCourse(@RequestBody Courses c){
        System.out.println(c.getCourseTitle());
        System.out.println(c.getDescription());
        System.out.println(c.getVenue());
        System.out.println(c.getDuration());
        System.out.println(c.getDate());
        return "Course added Successfully";
    }
}
