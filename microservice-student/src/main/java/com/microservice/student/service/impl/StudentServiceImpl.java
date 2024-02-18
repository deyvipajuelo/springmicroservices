package com.microservice.student.service.impl;

import com.microservice.student.model.entity.Student;
import com.microservice.student.model.dao.StudentDao;
import com.microservice.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student findById(Long id) {
        return studentDao.findById(id).orElse(null);
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public List<Student> getAllStudentsByCourseId(Long courseId) {
        return studentDao.getAllStudentsByCourseId(courseId);
    }
}
