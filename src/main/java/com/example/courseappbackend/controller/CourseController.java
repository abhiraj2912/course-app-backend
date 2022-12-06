package com.example.courseappbackend.controller;

import com.example.courseappbackend.dao.CourseDao;
import com.example.courseappbackend.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseDao dao;

    @PostMapping(path = "/add",consumes = "application/json", produces = "application/json")
    public String AddCourse(@RequestBody Courses c){
        System.out.println(c.getCourseTitle());
        System.out.println(c.getDescription());
        System.out.println(c.getVenue());
        System.out.println(c.getDuration());
        System.out.println(c.getDate());
        dao.save(c);
        return "Course added Successfully";
    }

    @GetMapping("/view")
    public List<Courses> ViewCourse(){
        return (List<Courses>) dao.findAll();
    }
}
