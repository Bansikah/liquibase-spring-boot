package com.bansikah.liquibase.controller;

import com.bansikah.liquibase.entity.Teacher;
import com.bansikah.liquibase.repository.TeacherRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherRepository teacherRepository;

    public TeacherController(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @PostMapping("/add")
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher) {
        Teacher savedTeacher = teacherRepository.save(teacher);
        return ResponseEntity.ok(savedTeacher);
    }


    @GetMapping("/get")
    public Iterable<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }
}
