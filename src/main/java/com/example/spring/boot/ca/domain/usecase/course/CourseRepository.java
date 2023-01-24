package com.example.spring.boot.ca.domain.usecase.course;

import com.example.spring.boot.ca.domain.model.course.dto.CourseDTO;
import com.example.spring.boot.ca.domain.model.gateway.ICourseRepository;

public class CourseRepository {

    private final ICourseRepository repository;

    public CourseRepository(ICourseRepository repository) {
        this.repository = repository;
    }

    public CourseDTO saveCourse(CourseDTO courseDTO) {
        return courseDTO.fromDomain(
                repository.saveCourse(
                        courseDTO.toDomain(courseDTO)));
    }
}
