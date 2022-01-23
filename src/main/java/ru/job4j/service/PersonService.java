package ru.job4j.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.job4j.domain.Person;
import ru.job4j.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository person;


    public PersonService(PersonRepository person) {
        this.person = person;
    }

    @Transactional
    public List<Person> findAll() {
        List<Person> result = new ArrayList<Person>();
        person.findAll().forEach(result::add);
        return result;
    }

    @Transactional
    public Person findById(int id) {
        return person.findById(id).orElse(null);
    }

    @Transactional
    public void save(Person persons) {
        person.save(persons);
    }

    @Transactional
    public void delete (int id) {
         person.deleteById(id);
    }
}
