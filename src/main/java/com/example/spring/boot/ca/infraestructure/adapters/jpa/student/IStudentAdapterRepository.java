package com.example.spring.boot.ca.infraestructure.adapters.jpa.student;

import com.example.spring.boot.ca.infraestructure.adapters.jpa.student.entity.StudentDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentAdapterRepository extends JpaRepository<StudentDBO, Long> {

}
