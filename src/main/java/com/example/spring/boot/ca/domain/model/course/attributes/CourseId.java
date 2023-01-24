package com.example.spring.boot.ca.domain.model.course.attributes;

public class CourseId {

    private final Long value;

    public CourseId(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }
}
