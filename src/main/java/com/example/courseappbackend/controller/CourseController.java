package com.example.courseappbackend.controller;

import com.example.courseappbackend.dao.CourseDao;
import com.example.courseappbackend.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseDao dao;


    @CrossOrigin("*")
    @PostMapping(path = "/add",consumes = "application/json", produces = "application/json")
    public HashMap<String, String> AddCourse(@RequestBody Courses c){
        dao.save(c);
        HashMap <String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin("*")
    @GetMapping("/view")
    public List<Courses> ViewCourse(){
        return (List<Courses>) dao.findAll();
    }
}
