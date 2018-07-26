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
    @NotNull
    private Date dateOfBirth;


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
}
