package com.example.penfond.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Company {
    @Id
    private long id;
    @NotNull
    private String name;

    public Company(String name) {
        this.name = name;
    }
}
