package domain.services.appointment.interfaces;

import domain.appointment.Programare;

public interface IValidatingAppointmentService {

    // Metodă pentru a valida o programare
    boolean valideazaProgramare(Programare programare);

    // Metodă pentru a verifica dacă o programare nu se suprapune cu alte programări
    boolean verificaSuprapunereProgramare(Programare programare);
}