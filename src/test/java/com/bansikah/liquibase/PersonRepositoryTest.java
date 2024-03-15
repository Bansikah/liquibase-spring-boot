package com.bansikah.liquibase;

import com.bansikah.liquibase.entity.Person;
import com.bansikah.liquibase.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@RunWith(SpringRunner.class)
@DataJpaTest  // Annotation for in-memory database and JPA test setup

public class PersonRepositoryTest {
        @Autowired
        private PersonRepository personRepository;

        @Test
        public void testSavePerson() {
            Person person = new Person();
            person.setName("John Doe");
            Person savedPerson = personRepository.save(person);
        }
    }

