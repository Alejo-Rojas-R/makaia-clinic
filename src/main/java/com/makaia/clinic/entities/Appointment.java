package com.makaia.clinic.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @ManyToOne(optional = false)
    Dentist dentist;
    @ManyToOne(optional = false)
    Patient patient;

    public Appointment() {
    }
    public Appointment(Long id, Date date) {
        this.date = date;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Appointment{" +
                "date=" + date +
                ", dentist=" + dentist +
                ", patient=" + patient +
                '}';
    }
}
