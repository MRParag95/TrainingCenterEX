package com.mendax47.trainingcenter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@Getter
@Setter
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    @SequenceGenerator(name = "course_seq", initialValue = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Column(name = "duration", nullable = false)
    private Integer duration;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "course_trainees", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "trainees_id"))
    private HashSet<Trainee> trainees = new HashSet<>();
}