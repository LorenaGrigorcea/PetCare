package domain.services.patient.impl;

import domain.patient.Pacient;

public interface ISummarizingPacientDataService {

    // Metodă pentru a obține sumarul datelor generale ale pacientului
    String sumarizeazaDateGenerale(Pacient pacient);

    // Metodă pentru a sumariza istoricul medical al unui pacient
    String sumarizeazaIstoricMedical(Pacient pacient);

    // Metodă pentru a obține starea curentă a pacientului
    String sumarizeazaStarePacient(Pacient pacient);
}