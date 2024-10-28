package domain.user_clinic;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
public class ProgramDeLucru {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime oraIncepere;
    private LocalTime oraSfarsit;

    public ProgramDeLucru(Long id, LocalTime oraIncepere, LocalTime oraSfarsit) {
        this.id = id;
        this.oraIncepere = oraIncepere;
        this.oraSfarsit = oraSfarsit;
    }

    public ProgramDeLucru() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getOraIncepere() {
        return oraIncepere;
    }

    public void setOraIncepere(LocalTime oraIncepere) {
        this.oraIncepere = oraIncepere;
    }

    public LocalTime getOraSfarsit() {
        return oraSfarsit;
    }

    public void setOraSfarsit(LocalTime oraSfarsit) {
        this.oraSfarsit = oraSfarsit;
    }
}
