package domain.services.appointment.impl;

import domain.appointment.Programare;
import domain.services.appointment.interfaces.IValidatingAppointmentService;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class ValidatingAppointmentServiceImpl implements IValidatingAppointmentService {

    private final List<Programare> programariExistente;

    public ValidatingAppointmentServiceImpl(List<Programare> programariExistente) {
        this.programariExistente = programariExistente;
    }

    @Override
    public boolean valideazaProgramare(Programare programare) {
        // Verificăm dacă ora de începere este înaintea orei de sfârșit
        if (programare.getOraIncepere().isAfter(programare.getOraSfarsit())) {
            System.out.println("Programarea are o oră de început după ora de sfârșit.");
            return false;
        }

        // Verificăm dacă nu există suprapuneri cu alte programări
        if (verificaSuprapunereProgramare(programare)) {
            System.out.println("Programarea se suprapune cu o altă programare.");
            return false;
        }

        // Validarea a trecut cu succes
        return true;
    }

    @Override
    public boolean verificaSuprapunereProgramare(Programare programareNoua) {
        for (Programare programareExistenta : programariExistente) {
            // Verificăm doar programările care au loc în aceeași zi
            if (programareExistenta.getData().equals(programareNoua.getData())) {
                LocalTime oraIncepereExistenta = programareExistenta.getOraIncepere();
                LocalTime oraSfarsitExistenta = programareExistenta.getOraSfarsit();

                // Verificăm dacă există suprapunere între intervalele de timp
                boolean suprapunere = !programareNoua.getOraSfarsit().isBefore(oraIncepereExistenta) &&
                        !programareNoua.getOraIncepere().isAfter(oraSfarsitExistenta);

                if (suprapunere) {
                    return true;
                }
            }
        }
        return false;
    }
}