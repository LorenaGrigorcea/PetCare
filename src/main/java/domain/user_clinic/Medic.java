package domain.user_clinic;

import domain.appointment.Programare;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Medic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String specializare;
    private int nivelExperienta;
    private String birou;

    // Legăm medicul de utilizator pentru a accesa numele, emailul, etc.
    @OneToOne
    @JoinColumn(name = "utilizator_id")
    private Utilizator utilizator;


    @ManyToOne
    @JoinColumn(name = "clinica_id")
    private Clinica clinica;

    @OneToMany(mappedBy = "medic", cascade = CascadeType.ALL)
    private List<Programare> programari;

    @OneToOne(cascade = CascadeType.ALL)
    private ProgramDeLucru programDeLucru;

    public Utilizator getUtilizator() {
        return utilizator;
    }

    public void setUtilizator(Utilizator utilizator) {
        this.utilizator = utilizator;
    }

    public Medic(Long id, String specializare, int nivelExperienta, String birou, Clinica clinica, List<Programare> programari, ProgramDeLucru programDeLucru) {
        this.id = id;
        this.specializare = specializare;
        this.nivelExperienta = nivelExperienta;
        this.birou = birou;
        this.clinica = clinica;
        this.programari = programari;
        this.programDeLucru = programDeLucru;
    }

    public Medic() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public int getNivelExperienta() {
        return nivelExperienta;
    }

    public void setNivelExperienta(int nivelExperienta) {
        this.nivelExperienta = nivelExperienta;
    }

    public String getBirou() {
        return birou;
    }

    public void setBirou(String birou) {
        this.birou = birou;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public List<Programare> getProgramari() {
        return programari;
    }

    public void setProgramari(List<Programare> programari) {
        this.programari = programari;
    }

    public ProgramDeLucru getProgramDeLucru() {
        return programDeLucru;
    }

    public void setProgramDeLucru(ProgramDeLucru programDeLucru) {
        this.programDeLucru = programDeLucru;
    }
}

