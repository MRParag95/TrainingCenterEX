package com.mendax47.trainingcenter.services;

import com.mendax47.trainingcenter.repositories.DirectorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DirectorService {
    private final DirectorRepository directorRepository;
}