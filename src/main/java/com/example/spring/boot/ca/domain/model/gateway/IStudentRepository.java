package com.example.spring.boot.ca.domain.model.gateway;

import com.example.spring.boot.ca.domain.model.student.Student;

public interface IStudentRepository {

    Student saveStudent(Student student);

}
