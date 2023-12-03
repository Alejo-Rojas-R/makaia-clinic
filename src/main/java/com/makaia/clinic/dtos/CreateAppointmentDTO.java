package com.makaia.clinic.dtos;

import java.util.Date;

public class CreateAppointmentDTO {
    private Date date;
    private Long idPatient;
    private Long idDentist;

    public CreateAppointmentDTO(Date date, Long idPatient, Long idDentist) {
        this.date = date;
        this.idPatient = idPatient;
        this.idDentist = idDentist;
    }

    public CreateAppointmentDTO() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Long idPatient) {
        this.idPatient = idPatient;
    }

    public Long getIdDentist() {
        return idDentist;
    }

    public void setIdDentist(Long idDentist) {
        this.idDentist = idDentist;
    }
}
