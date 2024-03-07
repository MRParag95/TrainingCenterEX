package com.mendax47.trainingcenter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trainee")
public class Trainee extends Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trainee_seq")
    @SequenceGenerator(name = "trainee_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
}