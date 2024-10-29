package domain.services.medic.interfaces;

import domain.user_clinic.Medic;

public interface IValidatingMedicService {

    // Metodă pentru a valida un medic înainte de a-l adăuga sau actualiza
    boolean valideazaMedic(Medic medic);

    // Metodă pentru a verifica dacă un medic este disponibil pentru o programare
    boolean verificaDisponibilitate(Medic medic, String data);
}