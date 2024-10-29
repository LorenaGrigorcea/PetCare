package domain.services.appointment.interfaces;

import domain.appointment.Programare;
import java.util.List;
//in interfata definim sau apelam metodele

// iar AppointmentServiceImpl conține logica propriu-zisă a acestor metode.
public interface IAppointmentService {
    void creeazaProgramare(Programare programare);

    void anuleazaProgramare(Long id);

    List<Programare> vizualizeazaToateProgramarile();

    Programare gasesteProgramareDupaId(Long id);

    void confirmaProgramare(Long id);
}
