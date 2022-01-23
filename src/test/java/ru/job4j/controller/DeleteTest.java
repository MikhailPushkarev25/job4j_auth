package ru.job4j.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import ru.job4j.Job4jAuthApplication;
import ru.job4j.domain.Person;
import ru.job4j.service.PersonService;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

@SpringBootTest(classes = Job4jAuthApplication.class)
@AutoConfigureJdbc
public class DeleteTest {

    @Autowired
    private PersonService person;

    @Test
    @Transactional
    public void shouldReturnDefaultMessage() throws Exception {
        person.save(new Person(1, "result", "123"));
        person.delete(1);
        assertNull(person.findById(1));
    }
}
