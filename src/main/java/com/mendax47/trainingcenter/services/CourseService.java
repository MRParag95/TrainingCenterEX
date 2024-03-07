package com.mendax47.trainingcenter.services;

import com.mendax47.trainingcenter.repositories.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;
}