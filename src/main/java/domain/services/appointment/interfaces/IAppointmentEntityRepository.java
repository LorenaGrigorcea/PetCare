package domain.services.appointment.interfaces;

import domain.appointment.Programare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IAppointmentEntityRepository extends JpaRepository<Programare, Long> {
    // Metodă pentru găsirea programărilor pe o anumită dată
    List<Programare> findByData(LocalDate data);

    // Poți adăuga metode personalizate suplimentare
}