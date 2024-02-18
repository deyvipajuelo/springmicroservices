package com.microservice.course.service;

import com.microservice.course.http.response.StudentByCursoResponse;
import com.microservice.course.model.entity.Course;

public interface CourseService {

    Course findById(Long id);

    void save(Course course);

    StudentByCursoResponse getStudentsByCourseId(Long id);
}
