package domain.services.patient.impl;

import domain.patient.Pacient;

public interface IPacientEntityFactory {

    Pacient creeazaPacient(String nume, String rasa, String specie, String cnp, String detaliiMedicale);
}
