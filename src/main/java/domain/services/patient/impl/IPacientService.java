package domain.services.patient.impl;

import domain.patient.Pacient;
import java.util.List;

public interface IPacientService {
    void adaugaPacient(Pacient pacient);

    void modificaPacient(Pacient pacient, String numeNou);

    List<Pacient> vizualizeazaPacienti();

    Pacient gasestePacientDupaId(Long id);
}