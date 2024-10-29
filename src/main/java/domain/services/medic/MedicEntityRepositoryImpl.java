package domain.services.medic;

import domain.services.medic.interfaces.MedicEntityRepositoryCustom;
import domain.user_clinic.Medic;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicEntityRepositoryImpl implements MedicEntityRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Medic> gasesteMediciDupaSpecializare(String specializare) {
        TypedQuery<Medic> query = entityManager.createQuery(
                "SELECT m FROM Medic m WHERE m.specializare = :specializare", Medic.class);
        query.setParameter("specializare", specializare);
        return query.getResultList();
    }
}
