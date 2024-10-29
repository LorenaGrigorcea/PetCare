package domain.services.medic.interfaces;

import domain.user_clinic.Medic;
import java.util.List;

public interface MedicEntityRepositoryCustom {
    // Metodă personalizată pentru a găsi medici după specializare
    List<Medic> gasesteMediciDupaSpecializare(String specializare);
}
