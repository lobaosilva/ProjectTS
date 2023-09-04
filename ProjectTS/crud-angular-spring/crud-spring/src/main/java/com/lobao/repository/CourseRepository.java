package com.lobao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lobao.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
