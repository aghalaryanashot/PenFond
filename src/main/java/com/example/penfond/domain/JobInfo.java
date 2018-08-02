package com.example.penfond.domain;

import javax.persistence.*;
import io.ebean.annotation.NotNull;
import java.util.Date;

@Entity
public class JobInfo {
    @Id
    private long id;

    @ManyToOne
    @NotNull
    private Person person;

    @ManyToOne
    @NotNull
    private Company company;

    @NotNull
    private int baseRate;
    private Date dateArrival;
    private Date dateExit;

    public JobInfo() {
    }

    public JobInfo(
            Person person,
            Company company,
            int baseRate,
            Date arrivaldate,
            Date datedeparture
    ) {
        this.person = person;
        this.company = company;
        this.baseRate = baseRate;
        this.dateArrival = arrivaldate;
        this.dateExit = datedeparture;
    }

    public JobInfo(
            Person person,
            Company company,
            int baseRate,
            Date arrivaldate
    ) {
        this.person = person;
        this.company = company;
        this.baseRate = baseRate;
        this.dateArrival = arrivaldate;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public Date getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(Date dateArrival) {
        this.dateArrival = dateArrival;
    }

    public Date getDateExit() {
        return dateExit;
    }

    public void setDateExit(Date dateExit) {
        this.dateExit = dateExit;
    }
}
