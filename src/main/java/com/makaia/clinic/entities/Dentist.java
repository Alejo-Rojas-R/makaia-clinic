package com.makaia.clinic.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String lastName;

    private Long tuition;

    public Dentist() {
    }

    public Dentist(String name, String lastName, Long tuition) {
        this.name = name;
        this.lastName = lastName;
        this.tuition = tuition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getTuition() {
        return tuition;
    }

    public void setTuition(Long tuition) {
        this.tuition = tuition;
    }

    @Override
    public String toString() {
        return "Dentist{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tuition=" + tuition +
                ", appointments=" + appointments +
                '}';
    }

    @OneToMany(mappedBy = "dentist")
    List<Appointment> appointments;
}
