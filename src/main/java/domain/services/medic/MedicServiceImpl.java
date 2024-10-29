package domain.services.medic;

import domain.services.medic.interfaces.IMedicEntityRepository;
import domain.services.medic.interfaces.IMedicService;
import domain.user_clinic.Medic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicServiceImpl implements IMedicService {

    @Autowired
    private IMedicEntityRepository medicEntityRepository;

    @Override
    public Medic adaugaMedic(Medic medic) {
        return medicEntityRepository.save(medic);
    }

    @Override
    public List<Medic> gasesteTotiMedicii() {
        return medicEntityRepository.findAll();
    }

    @Override
    public Medic gasesteMedicDupaId(Long id) {
        return medicEntityRepository.findById(id).orElse(null);
    }

    @Override
    public boolean verificaDisponibilitate(Medic medic, String data) {
        // Logica pentru a verifica dacă medicul are programări într-o anumită zi
        // Aceasta este doar o schemă, logica reală poate fi implementată în funcție de structura datelor
        // Se poate interoga baza de date pentru a verifica programările medicului
        return true; // Exemplu: returnăm true pentru disponibil
    }
}
