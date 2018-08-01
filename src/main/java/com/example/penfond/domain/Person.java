package com.example.penfond.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Person {
    @Id
    private long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String patronymic;
    @NotNull
    private long inn;
    @NotNull
    private long snils;
    private Date dateOfBirth;

    public Person() {
    }

    public Person(long id, @NotNull String firstName, @NotNull String lastName, String patronymic, @NotNull long inn, @NotNull long snils, @NotNull Date dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.inn = inn;
        this.snils = snils;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String firstName, String lastName, String patronymic, long inn, long snils, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.inn = inn;
        this.snils = snils;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String firstName, String lastName, long inn, long snils, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.inn = inn;
        this.snils = snils;
        this.dateOfBirth = dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public long getInn() {
        return inn;
    }

    public void setInn(long inn) {
        this.inn = inn;
    }

    public long getSnils() {
        return snils;
    }

    public void setSnils(long snils) {
        this.snils = snils;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
