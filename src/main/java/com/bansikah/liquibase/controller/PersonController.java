package com.bansikah.liquibase.controller;

import com.bansikah.liquibase.entity.Person;
import com.bansikah.liquibase.repository.PersonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person) {
        return repository.save(person);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        Optional<Person> optionalPerson = repository.findById(id);
        return optionalPerson.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
