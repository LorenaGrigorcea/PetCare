package domain.services.patient.interfaces;
import domain.patient.Pacient;
import domain.services.patient.impl.IPacientService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PacientServiceImpl implements IPacientService {

    private List<Pacient> pacienti = new ArrayList<>();

    @Override
    public void adaugaPacient(Pacient pacient) {
        pacienti.add(pacient);
        System.out.println("Pacient adăugat: " + pacient.getNume());
    }

    // Metodă pentru modificarea numelui unui pacient
    @Override
    public void modificaPacient(Pacient pacient, String numeNou) {
        pacient.setNume(numeNou);
        System.out.println("Pacient modificat: " + pacient.getNume());
    }

    // Metodă care returnează toți pacienții stocați
    @Override
    public List<Pacient> vizualizeazaPacienti() {
        // Returnăm lista de pacienți
        return pacienti;
    }

    @Override
    public Pacient gasestePacientDupaId(Long id) {
        // Folosim un stream pentru a găsi pacientul pe baza ID-ului
        Optional<Pacient> pacient = pacienti.stream()
                .filter(p -> p.getId().equals(id)) // Filtrăm pacienții după ID
                .findFirst(); // Găsim primul pacient care corespunde
        // Dacă pacientul este găsit, îl returnăm și afișăm un mesaj
        if (pacient.isPresent()) {
            System.out.println("Pacient găsit: " + pacient.get().getNume());
            return pacient.get();
        } else {
            System.out.println("Pacientul cu ID-ul " + id + " nu a fost găsit.");
            return null;
        }
    }
}
