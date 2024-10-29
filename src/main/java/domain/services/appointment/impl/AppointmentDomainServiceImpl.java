package domain.services.appointment.impl;

import domain.appointment.Programare;
import domain.services.appointment.interfaces.IAppointmentDomainService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentDomainServiceImpl implements IAppointmentDomainService {

    @Override
    public boolean valideazaProgramare(Programare programare) {
        // Validăm că data și orele nu sunt null și că ora de început este înainte de ora de sfârșit
        if (programare.getData() == null || programare.getOraIncepere() == null || programare.getOraSfarsit() == null) {
            return false;
        }
        return programare.getOraIncepere().isBefore(programare.getOraSfarsit());
    }

    @Override
    public boolean existaSuprapunereProgramare(Programare programareNoua, List<Programare> programari) {
        // Verificăm dacă există o suprapunere între o programare nouă și lista existentă de programări
        for (Programare programare : programari) {
            if (programare.getData().equals(programareNoua.getData())) {
                LocalTime oraIncepere = programare.getOraIncepere();
                LocalTime oraSfarsit = programare.getOraSfarsit();

                // Verificăm suprapunerea intervalului orar
                boolean suprapunere = !programareNoua.getOraSfarsit().isBefore(oraIncepere) &&
                        !programareNoua.getOraIncepere().isAfter(oraSfarsit);

                if (suprapunere) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<Programare> gasesteProgramariPeZi(LocalDate data, List<Programare> programari) {
        // Returnăm toate programările pentru o anumită zi
        return programari.stream()
                .filter(programare -> programare.getData().equals(data))
                .collect(Collectors.toList());
    }
}
