package com.microservice.course.client;

import com.microservice.course.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-student", url = "localhost:8080/api/v1/student")
public interface StudentClient {

    @GetMapping("studentsByCourseId/{id}")
    List<StudentDto> findAllStudentsByCourseId(@PathVariable  Long id);

}
