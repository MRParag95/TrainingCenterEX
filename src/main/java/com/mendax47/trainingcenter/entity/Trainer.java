package com.mendax47.trainingcenter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trainer")
public class Trainer extends Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trainer_seq")
    @SequenceGenerator(name = "trainer_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coordinator_id")
    private Coordinator coordinator;
}