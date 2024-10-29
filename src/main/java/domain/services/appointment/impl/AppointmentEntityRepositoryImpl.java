package domain.services.appointment.impl;

import domain.appointment.Programare;
import domain.services.appointment.interfaces.AppointmentEntityRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class AppointmentEntityRepositoryImpl implements AppointmentEntityRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Programare> gasesteProgramariPersonalizate(LocalDate data, Long medicId) {
        // Exemplar de interogare personalizată pentru găsirea programărilor după dată și ID-ul medicului
        TypedQuery<Programare> query = entityManager.createQuery(
                "SELECT p FROM Programare p WHERE p.data = :data AND p.medic.id = :medicId", Programare.class);
        query.setParameter("data", data);
        query.setParameter("medicId", medicId);
        return query.getResultList();
    }
}
