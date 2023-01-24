package com.example.spring.boot.ca.infraestructure.adapters.jpa.course;

import com.example.spring.boot.ca.domain.model.course.Course;
import com.example.spring.boot.ca.domain.model.gateway.ICourseRepository;
import com.example.spring.boot.ca.infraestructure.adapters.jpa.course.entity.CourseDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseRepositoryAdapter implements ICourseRepository {

    private final ICourseAdapterRepository repository;

    @Override
    public Course saveCourse(Course course) {
        CourseDBO courseDBO = new CourseDBO().fromDomain(course);
        return courseDBO.toDomain(repository.save(courseDBO));
    }
}
