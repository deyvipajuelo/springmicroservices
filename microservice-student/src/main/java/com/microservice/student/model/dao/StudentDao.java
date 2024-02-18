package com.microservice.student.model.dao;

import com.microservice.student.model.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends CrudRepository<Student, Long> {

    @Query("SELECT s FROM Student s where s.courseId = :courseId")
    List<Student> getAllStudentsByCourseId(Long courseId);
//    public List<Student> findAllByCourseId(Long courseId);
}
