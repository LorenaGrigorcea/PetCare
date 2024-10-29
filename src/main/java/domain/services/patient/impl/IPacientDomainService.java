package domain.services.patient.impl;

import domain.patient.Pacient;

public interface IPacientDomainService {

    int calculeazaVarsta(Pacient pacient);

    boolean areVaccinarileLaZi(Pacient pacient);

    boolean esteSterilizat(Pacient pacient);
}