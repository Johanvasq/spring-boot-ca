package com.example.spring.boot.ca.domain.usecase.student;

import com.example.spring.boot.ca.domain.model.gateway.IStudentRepository;
import com.example.spring.boot.ca.domain.model.student.dto.StudentDTO;

public class StudentRepository {

    private final IStudentRepository repository;

    public StudentRepository(IStudentRepository repository) {
        this.repository = repository;
    }

    public StudentDTO save(StudentDTO studentDTO){
        return studentDTO.fromDomain(
                repository.saveStudent(
                        studentDTO.toDomain(
                                studentDTO)));
    }


}
