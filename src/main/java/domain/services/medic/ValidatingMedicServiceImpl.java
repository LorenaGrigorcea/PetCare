package domain.services.medic;

import domain.services.medic.interfaces.IValidatingMedicService;
import domain.user_clinic.Medic;
import org.springframework.stereotype.Service;

@Service
public class ValidatingMedicServiceImpl implements IValidatingMedicService {

    @Override
    public boolean valideazaMedic(Medic medic) {
        // Accesăm numele medicului prin obiectul Utilizator asociat
        if (medic.getUtilizator() == null || medic.getUtilizator().getNume() == null || medic.getUtilizator().getNume().isEmpty()) {
            System.out.println("Numele medicului nu poate fi gol.");
            return false;
        }

        if (medic.getSpecializare() == null || medic.getSpecializare().isEmpty()) {
            System.out.println("Specializarea medicului nu poate fi goală.");
            return false;
        }
        return true;
    }

    @Override
    public boolean verificaDisponibilitate(Medic medic, String data) {
        // Logica pentru verificarea disponibilității
        return true;  // Exemplu de validare
    }
}
