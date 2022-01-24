package ru.job4j.domain;

import java.sql.Timestamp;

public class Employee {

    private int id;
    private String name;
    private String surname;
    private int inn;
    private Timestamp created;
    private Person person;

    public static Employee of(int id, String name, String surname, int inn, Person person) {
        Employee employee = new Employee();
        employee.id = id;
        employee.name = name;
        employee.surname = surname;
        employee.inn = inn;
        employee.created = new Timestamp(System.currentTimeMillis());
        employee.person = person;
        return employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
