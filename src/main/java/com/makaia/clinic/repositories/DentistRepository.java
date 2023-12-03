package com.makaia.clinic.repositories;

import com.makaia.clinic.entities.Dentist;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends CrudRepository<Dentist, Long> {
    @Query
    public Dentist findByTuition(Long tuition);
}
