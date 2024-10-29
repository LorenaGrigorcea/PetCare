package domain.services.appointment.impl;

import domain.appointment.Programare;
import domain.common.StareProgramare;
import domain.common.TipServiciu;
import domain.patient.Pacient;
import domain.services.appointment.interfaces.IAppointmentEntityFactory;
import domain.user_clinic.Medic;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class AppointmentEntityFactoryImpl implements IAppointmentEntityFactory {

    @Override
    public Programare creeazaProgramare(TipServiciu tipServiciu, LocalDate data, LocalTime oraIncepere, LocalTime oraSfarsit,
                                        String sala, String detalii, StareProgramare stareProgramare, Medic medic, Pacient pacient) {
        // Creăm o nouă programare și setăm toate atributele
        Programare programareNoua = new Programare();
        programareNoua.setTipServiciu(tipServiciu);
        programareNoua.setData(data);
        programareNoua.setOraIncepere(oraIncepere);
        programareNoua.setOraSfarsit(oraSfarsit);
        programareNoua.setSala(sala);
        programareNoua.setDetalii(detalii);
        programareNoua.setStareProgramare(stareProgramare);
        programareNoua.setMedic(medic);
        programareNoua.setPacient(pacient);

        return programareNoua;
    }
}
