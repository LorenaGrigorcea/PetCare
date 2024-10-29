package domain.services.appointment.interfaces;

import domain.appointment.Programare;
import java.time.LocalDate;
import java.util.List;

public interface IAppointmentDomainService {

    boolean valideazaProgramare(Programare programare);

    boolean existaSuprapunereProgramare(Programare programareNoua, List<Programare> programari);

    List<Programare> gasesteProgramariPeZi(LocalDate data, List<Programare> programari);
}
