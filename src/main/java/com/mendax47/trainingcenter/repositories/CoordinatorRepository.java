package com.mendax47.trainingcenter.repositories;

import com.mendax47.trainingcenter.entity.Coordinator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CoordinatorRepository extends JpaRepository<Coordinator, Long>, JpaSpecificationExecutor<Coordinator> {
}