package com.microservice.course.service.impl;

import com.microservice.course.client.StudentClient;
import com.microservice.course.dto.StudentDto;
import com.microservice.course.http.response.StudentByCursoResponse;
import com.microservice.course.model.dao.CourseDao;
import com.microservice.course.model.entity.Course;
import com.microservice.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private StudentClient studentClient;

    @Autowired
    private CourseDao courseDao;

    @Override
    public Course findById(Long id) {
        return courseDao.findById(id).orElse(null);
    }

    @Override
    public void save(Course course) {
        courseDao.save(course);
    }

    @Override
    public StudentByCursoResponse getStudentsByCourseId(Long id) {
        Course course = courseDao.findById(id).orElse(new Course());

        List<StudentDto> studentsList = studentClient.findAllStudentsByCourseId(id);

        return StudentByCursoResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentsDtoList(studentsList)
                .build();
    }
}
