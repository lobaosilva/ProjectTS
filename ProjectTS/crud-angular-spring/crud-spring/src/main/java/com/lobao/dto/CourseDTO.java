package com.lobao.dto;

import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lobao.controller.CourseController;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record CourseDTO(
    @JsonProperty("_id") Long id,
    @NotBlank @NotNull @Length(min = 5, max = 10) String name,
    @NotNull @Length(max = 10) @Pattern(regexp = "Back-end|Front-end") String category) {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public CourseDTO create(CourseController courseController) {
        return courseController.courseService.create(this);
    }
    
}
