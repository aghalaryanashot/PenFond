package com.example.penfond.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
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

    public JobInfo(
            @NotNull Person person,
            @NotNull Company company,
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
            @NotNull Person person,
            @NotNull Company company,
            int baseRate,
            Date arrivaldate
    ) {
        this.person = person;
        this.company = company;
        this.baseRate = baseRate;
        this.dateArrival = arrivaldate;
    }
}
