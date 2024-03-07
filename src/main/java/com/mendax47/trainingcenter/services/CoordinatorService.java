package com.mendax47.trainingcenter.services;

import com.mendax47.trainingcenter.repositories.CoordinatorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CoordinatorService {
    private final CoordinatorRepository coordinatorRepository;
}