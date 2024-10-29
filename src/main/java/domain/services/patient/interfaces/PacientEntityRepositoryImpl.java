package domain.services.patient.interfaces;

import domain.patient.Pacient;
import domain.services.patient.impl.PacientEntityRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class PacientEntityRepositoryImpl implements PacientEntityRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Pacient gasestePacientPersonalizat(String nume) {
        // Exemplar de interogare personalizată cu JPQL
        TypedQuery<Pacient> query = entityManager.createQuery("SELECT p FROM Pacient p WHERE p.nume = :nume", Pacient.class);
        query.setParameter("nume", nume);
        return query.getSingleResult();
    }
}