package com.example.spring.boot.ca.domain.model.course.dto;

import com.example.spring.boot.ca.domain.model.course.Course;
import com.example.spring.boot.ca.domain.model.course.attributes.CourseId;
import com.example.spring.boot.ca.domain.model.course.attributes.CourseName;

public class CourseDTO {

    private Long id;
    private String name;

    public CourseDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseDTO fromDomain(Course course){
        return new CourseDTO(
                course.getId().getValue(),
                course.getName().getValue()
        );
    }

    public Course toDomain(CourseDTO courseDTO){
        return new Course(
                new CourseId(courseDTO.getId()),
                new CourseName(courseDTO.getName())
        );
    }
}
