package domain.services.appointment.interfaces;

import domain.appointment.Programare;
import domain.common.StareProgramare;
import domain.common.TipServiciu;
import domain.patient.Pacient;
import domain.user_clinic.Medic;

import java.time.LocalDate;
import java.time.LocalTime;

public interface IAppointmentEntityFactory {

    // Metodă pentru crearea unei programări noi
    Programare creeazaProgramare(TipServiciu tipServiciu, LocalDate data, LocalTime oraIncepere, LocalTime oraSfarsit,
                                 String sala, String detalii, StareProgramare stareProgramare, Medic medic, Pacient pacient);
}
