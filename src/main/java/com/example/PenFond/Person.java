package com.example.PenFond;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person {
    @Id
    private long id;
    @Column(nullable=false)
    private String frstname;
    @Column(nullable=false)
    private String lastname;
    private String patronymic;
    @Column(nullable=false)
    private long inn;
    @Column(nullable=false)
    private long snils;
    @Column(nullable=false)
    private Date dob;


    public Person(String frstname, String lastname, String patronymic, long inn, long snils, Date dob) {
        this.frstname = frstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.inn = inn;
        this.snils = snils;
        this.dob = dob;
    }

    public Person(String frstname, String lastname, long inn, long snils, Date dob) {
        this.frstname = frstname;
        this.lastname = lastname;
        this.inn = inn;
        this.snils = snils;
        this.dob = dob;
    }

    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrstname() {
        return frstname;
    }

    public void setFrstname(String frstname) {
        this.frstname = frstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}
