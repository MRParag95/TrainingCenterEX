package com.mendax47.trainingcenter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "coordinator")
public class Coordinator extends Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coordinator_seq")
    @SequenceGenerator(name = "coordinator_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "director_id")
    private Director director;
}