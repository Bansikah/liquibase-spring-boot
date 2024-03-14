package com.bansikah.liquibase.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    private String course;

}
