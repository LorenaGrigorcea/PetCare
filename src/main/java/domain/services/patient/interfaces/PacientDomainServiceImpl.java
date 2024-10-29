package domain.services.patient.interfaces;

import domain.patient.Pacient;
import domain.services.patient.impl.IPacientDomainService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class PacientDomainServiceImpl implements IPacientDomainService {

    @Override
    public int calculeazaVarsta(Pacient pacient) {
        if (pacient.getDataNasterii() == null) {
            return 0;
        }
        return Period.between(pacient.getDataNasterii(), LocalDate.now()).getYears();
    }

    @Override
    public boolean areVaccinarileLaZi(Pacient pacient) {
        // Apelăm metoda areVaccinarileLaZi din IstoricMedical
        return pacient.getIstoricMedical().areVaccinarileLaZi();
    }

    @Override
    public boolean esteSterilizat(Pacient pacient) {
        return pacient.isSterilizat();
    }
}
