package com.makaia.clinic.controllers;

import com.makaia.clinic.entities.Dentist;
import com.makaia.clinic.services.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/clinic/dentist")
public class DentistController {
    private final DentistService service;

    @Autowired
    public DentistController(DentistService service) {
        this.service = service;
    }

    @PostMapping()
    public Dentist createDentist(@RequestBody Dentist dentist){
        return this.service.create(dentist);
    }

    @GetMapping()
    public List<Dentist> listDentists() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Dentist> findById(@PathVariable Long id) {
        return this.service.findById(id);
    }
}
