package com.example.spring.boot.ca.domain.model.gateway;

import com.example.spring.boot.ca.domain.model.course.Course;

public interface ICourseRepository {

    Course saveCourse(Course course);
}
