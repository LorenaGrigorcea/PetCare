package domain.services.patient.interfaces;

import domain.patient.Pacient;
import domain.services.patient.impl.ISummarizingPacientDataService;
import org.springframework.stereotype.Service;

@Service
public class SummarizingPacientDataServiceImpl implements ISummarizingPacientDataService {

    @Override
    public String sumarizeazaDateGenerale(Pacient pacient) {
        return String.format("Pacient: %s, Specie: %s, Rasa: %s, Vârstă: %d ani, Greutate: %.2f kg",
                pacient.getNume(), pacient.getSpecie(), pacient.getRasa(), pacient.getVarsta(), pacient.getGreutate());
    }

    @Override
    public String sumarizeazaIstoricMedical(Pacient pacient) {
        if (pacient.getIstoricMedical() == null) {
            return "Nu există informații despre istoricul medical.";
        }

        return String.format("Istoric Medical:\nEvoluție: %s\nAlergii: %s\nBoli Cronice: %s\nVaccinări: %s",
                pacient.getIstoricMedical().getEvolutie(),
                pacient.getIstoricMedical().getAlergii(),
                pacient.getIstoricMedical().getBoliCronice(),
                pacient.getIstoricMedical().getIstoricVaccinari());
    }

    @Override
    public String sumarizeazaStarePacient(Pacient pacient) {
        return String.format("Stare Pacient: %s", pacient.getStatus().name());
    }
}