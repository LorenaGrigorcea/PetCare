package domain.services.patient.impl;

import domain.patient.Pacient;

public interface PacientEntityRepositoryCustom {
    // Metodă personalizată pentru căutarea unui pacient după un criteriu specific
    Pacient gasestePacientPersonalizat(String nume);
}