package com.example.spring.boot.ca.application;

import com.example.spring.boot.ca.domain.model.gateway.ICourseRepository;
import com.example.spring.boot.ca.domain.model.gateway.IStudentRepository;
import com.example.spring.boot.ca.domain.usecase.course.CourseRepository;
import com.example.spring.boot.ca.domain.usecase.student.StudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public StudentRepository studentRepository(IStudentRepository iStudentRepository){
        return new StudentRepository(iStudentRepository);
    }

    @Bean
    public CourseRepository courseRepository(ICourseRepository iCourseRepository){
        return new CourseRepository(iCourseRepository);
    }
}
