package domain.services.patient.impl;

import domain.patient.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacientEntityRepository extends JpaRepository<Pacient, Long> {
    // Metodă pentru găsirea unui pacient după nume
    Pacient findByNume(String nume);
}