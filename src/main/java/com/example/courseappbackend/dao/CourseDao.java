package com.example.courseappbackend.dao;

import com.example.courseappbackend.model.Courses;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Courses, Integer> {
}
