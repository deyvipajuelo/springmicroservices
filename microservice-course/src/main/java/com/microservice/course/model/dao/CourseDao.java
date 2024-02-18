package com.microservice.course.model.dao;

import com.microservice.course.model.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course, Long> {
}
