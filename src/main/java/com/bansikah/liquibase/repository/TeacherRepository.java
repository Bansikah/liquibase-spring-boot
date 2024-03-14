package com.bansikah.liquibase.repository;

import com.bansikah.liquibase.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String >{
}
