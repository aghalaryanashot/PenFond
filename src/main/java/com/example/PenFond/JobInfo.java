package com.example.PenFond;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class JobInfo {
    @Id
    private long id;
    private long id_person;
    private long id_company;
    @Column(nullable=false)
    private int baserate;
    private Date dateinput;
    private Date dateoutput;

    public JobInfo(int baserate, Date arrivaldate, Date datedeparture) {
        this.baserate = baserate;
        this.dateinput = arrivaldate;
        this.dateoutput = datedeparture;
    }

    public JobInfo(int baserate, Date arrivaldate) {
        this.baserate = baserate;
        this.dateinput = arrivaldate;
    }

    public JobInfo() {
    }

    public int getBaserate() {
        return baserate;
    }

    public void setBaserate(int baserate) {
        this.baserate = baserate;
    }

    public Date getArrivaldate() {
        return dateinput;
    }

    public void setArrivaldate(Date arrivaldate) {
        this.dateinput = arrivaldate;
    }

    public Date getDatedeparture() {
        return dateoutput;
    }

    public void setDatedeparture(Date datedeparture) {
        this.dateoutput = datedeparture;
    }
}
