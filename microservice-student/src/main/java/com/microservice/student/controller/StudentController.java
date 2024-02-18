package com.microservice.student.controller;

import com.microservice.student.model.entity.Student;
import com.microservice.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @PostMapping("")
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping("/studentsByCourseId/{id}")
    public ResponseEntity<?> getStudentsByCourseId(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getAllStudentsByCourseId(id));
    }

}
