package com.microservice.student.service;

import com.microservice.student.model.entity.Student;

import java.util.List;

public interface StudentService {

    Student findById(Long id);
    void save(Student student);
    List<Student> getAllStudentsByCourseId(Long courseId);
}
