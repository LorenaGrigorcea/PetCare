package domain.services.appointment.interfaces;

import domain.appointment.Programare;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentEntityRepositoryCustom {
    // Metodă personalizată pentru găsirea programărilor după un anumit criteriu (de exemplu, pe o anumită dată și medic)
    List<Programare> gasesteProgramariPersonalizate(LocalDate data, Long medicId);
}