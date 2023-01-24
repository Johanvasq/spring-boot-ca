package com.example.spring.boot.ca.domain.model.student.attributes;

public class StudentId {
    private final Long value;

    public StudentId(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }
}