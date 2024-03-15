package com.bansikah.liquibase;



import com.bansikah.liquibase.entity.Person;
import com.bansikah.liquibase.repository.PersonRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringtestingApplication {

    @Autowired
    private PersonRepository personRepository;

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgresContainer() {
        return new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));
    }

    public static void main(String[] args) {
        SpringApplication.from(SpringbootliquibaseApplication::main).with(TestSpringtestingApplication.class).run(args);
    }


    @Test
    public void testSavePerson() {
        Person person = new Person();

        personRepository.save(person);

        List<Person> people = personRepository.findAll();
        assertEquals(1, people.size());
        assertEquals("John Doe", people.get(0).getName());
    }
}
