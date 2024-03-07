package com.mendax47.trainingcenter.repositories;

import com.mendax47.trainingcenter.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TraineeRepository extends JpaRepository<Trainee, Long>, JpaSpecificationExecutor<Trainee> {
}