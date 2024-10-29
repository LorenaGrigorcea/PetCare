package domain.services.medic.interfaces;

import domain.user_clinic.Medic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicEntityRepository extends JpaRepository<Medic, Long> {
    // Poți adăuga metode personalizate, cum ar fi găsirea medicilor după specializare
    Medic findByNume(String nume);}
