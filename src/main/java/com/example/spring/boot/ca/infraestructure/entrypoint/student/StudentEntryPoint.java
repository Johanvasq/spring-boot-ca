package com.example.spring.boot.ca.infraestructure.entrypoint.student;

import com.example.spring.boot.ca.domain.model.student.dto.StudentDTO;
import com.example.spring.boot.ca.domain.usecase.student.StudentRepository;
import lombok.AllArgsConstructor;
import org.apache.el.stream.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentEntryPoint {

    private final StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<?> saveStudent(StudentDTO studentDTO){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(studentRepository.save(studentDTO));
    }
}
