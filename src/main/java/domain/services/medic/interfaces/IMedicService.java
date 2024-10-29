package domain.services.medic.interfaces;

import domain.user_clinic.Medic;
import java.util.List;

public interface IMedicService {

    // Metodă pentru a adăuga un nou medic
    Medic adaugaMedic(Medic medic);

    // Metodă pentru a găsi toți medicii
    List<Medic> gasesteTotiMedicii();

    // Metodă pentru a găsi un medic după ID
    Medic gasesteMedicDupaId(Long id);

    // Metodă pentru a verifica disponibilitatea unui medic într-o anumită zi
    boolean verificaDisponibilitate(Medic medic, String data);
}