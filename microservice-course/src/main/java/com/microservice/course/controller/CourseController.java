package com.microservice.course.controller;

import com.microservice.course.model.entity.Course;
import com.microservice.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/course")
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.findById(id));
    }

    @PostMapping("")
    public void saveStudent(@RequestBody Course course) {
        courseService.save(course);
    }

    @GetMapping("/studentsByCourseId/{id}")
    public ResponseEntity<?> getStudentByCourseId(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.getStudentsByCourseId(id));
    }

}
