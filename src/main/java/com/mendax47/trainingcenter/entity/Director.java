package com.mendax47.trainingcenter.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "director")
public class Director extends Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "director_seq")
    @SequenceGenerator(name = "director_seq", allocationSize = 1)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
}