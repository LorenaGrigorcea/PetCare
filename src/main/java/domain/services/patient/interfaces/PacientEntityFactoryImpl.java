package domain.services.patient.interfaces;

import domain.patient.IstoricMedical;
import domain.patient.Pacient;
import domain.services.patient.impl.IPacientEntityFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PacientEntityFactoryImpl implements IPacientEntityFactory {

    @Override
    public Pacient creeazaPacient(String nume, String rasa, String specie, String cnp, String detaliiMedicale) {
        // Creăm un nou obiect IstoricMedical și setăm detaliile medicale
        IstoricMedical istoricMedical = new IstoricMedical();
        istoricMedical.setDetaliiMedicale(detaliiMedicale);

        // Creăm un nou pacient și asociem IstoricMedical
        Pacient pacientNou = new Pacient();
        pacientNou.setNume(nume);
        pacientNou.setRasa(rasa);
        pacientNou.setSpecie(specie);
        pacientNou.setIstoricMedical(istoricMedical); // Asociem istoricul medical
        pacientNou.setDataInregistrare(LocalDate.now()); // Setăm data de înregistrare

        return pacientNou;
    }
}
