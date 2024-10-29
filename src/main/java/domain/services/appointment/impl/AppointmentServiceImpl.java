package domain.services.appointment.impl;

import domain.appointment.Programare;
import domain.common.StareProgramare;
import domain.services.appointment.interfaces.IAppointmentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AppointmentServiceImpl implements IAppointmentService {

    private List<Programare> programari = new ArrayList<>();

    @Override
    public void creeazaProgramare(Programare programare) {
        programari.add(programare);
        System.out.println("Programare creată: " + programare.getTipServiciu() + " pentru data: " + programare.getData());
    }

    @Override
    public void anuleazaProgramare(Long id) {
        Optional<Programare> programareOptional = programari.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();

        if (programareOptional.isPresent()) {
            Programare programare = programareOptional.get();
            programari.remove(programare);
            System.out.println("Programare anulată pentru ID: " + id);
        } else {
            System.out.println("Programarea cu ID-ul " + id + " nu a fost găsită.");
        }
    }

    @Override
    public List<Programare> vizualizeazaToateProgramarile() {
        return programari;
    }

    @Override
    public Programare gasesteProgramareDupaId(Long id) {
        // Folosim un stream pentru a găsi programarea pe baza ID-ului
        Optional<Programare> programareOptional = programari.stream()
                .filter(p -> p.getId().equals(id)) // Filtrează programările după ID
                .findFirst(); // Găsește prima programare care corespunde

        // Dacă programarea este găsită, o returnăm și afișăm un mesaj
        if (programareOptional.isPresent()) {
            System.out.println("Programare găsită: " + programareOptional.get().getTipServiciu() + " pentru data: " + programareOptional.get().getData());
            return programareOptional.get();
        } else {
            System.out.println("Programarea cu ID-ul " + id + " nu a fost găsită.");
            return null;
        }
    }

    @Override
    public void confirmaProgramare(Long id) {
        // Căutăm programarea în lista locală după ID
        Optional<Programare> programareOptional = programari.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();

        // Dacă programarea este găsită, actualizăm starea la CONFIRMATA
        if (programareOptional.isPresent()) {
            Programare programare = programareOptional.get();
            programare.setStareProgramare(StareProgramare.CONFIRMATA);
            // Mesaj care confirmă că programarea a fost actualizată
            System.out.println("Programare confirmată pentru ID: " + id);
        } else {
            System.out.println("Programarea cu ID-ul " + id + " nu a fost găsită.");
        }
    }

}
