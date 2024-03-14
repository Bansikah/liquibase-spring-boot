package com.bansikah.liquibase.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
