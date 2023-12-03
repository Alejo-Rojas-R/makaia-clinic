package com.makaia.clinic.services;

import com.makaia.clinic.entities.Dentist;
import com.makaia.clinic.exceptions.ClinicApiException;
import com.makaia.clinic.repositories.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
public class DentistService {
    DentistRepository repository;

    @Autowired
    public DentistService(DentistRepository repository) {
        this.repository = repository;
    }

    public Dentist create(Dentist dentist) {
        Dentist exists = this.repository.findByTuition(dentist.getTuition());

        if (exists != null) {
            throw new ClinicApiException("A dentist with the tuition " + dentist.getTuition() + " is already on the database", HttpStatusCode.valueOf(400));
        }

        Dentist newDentist = new Dentist(dentist.getName(), dentist.getLastName(), dentist.getTuition());
        newDentist = this.repository.save(newDentist);

        return newDentist;
    }

    public List<Dentist> findAll() {
        return StreamSupport
                .stream(this.repository.findAll().spliterator(), false)
                .toList();
    }

    public Optional<Dentist> findById(Long id) {
        return this.repository.findById(id);
    }
}
