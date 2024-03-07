package com.mendax47.trainingcenter.services;

import com.mendax47.trainingcenter.repositories.TraineeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TrainerService {
    private final TraineeRepository traineeRepository;
}