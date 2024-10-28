package domain.patient;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class IstoricMedical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataInregistrare;
    private String evolutie;
    private String istoricVaccinari;
    private String alergii;
    private String boliCronice;

    @OneToOne(mappedBy = "istoricMedical")
    private Pacient pacient;

    @OneToMany(mappedBy = "istoricMedical", cascade = CascadeType.ALL)
    private List<FisaConsultatie> fiseConsultatii;

    @OneToMany(mappedBy = "istoricMedical", cascade = CascadeType.ALL)
    private List<FisaInterventie> fiseInterventii;

    public IstoricMedical(Long id, LocalDate dataInregistrare, String evolutie, String istoricVaccinari, String alergii, String boliCronice, Pacient pacient, List<FisaConsultatie> fiseConsultatii, List<FisaInterventie> fiseInterventii) {
        this.id = id;
        this.dataInregistrare = dataInregistrare;
        this.evolutie = evolutie;
        this.istoricVaccinari = istoricVaccinari;
        this.alergii = alergii;
        this.boliCronice = boliCronice;
        this.pacient = pacient;
        this.fiseConsultatii = fiseConsultatii;
        this.fiseInterventii = fiseInterventii;
    }

    public IstoricMedical() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataInregistrare() {
        return dataInregistrare;
    }

    public void setDataInregistrare(LocalDate dataInregistrare) {
        this.dataInregistrare = dataInregistrare;
    }

    public String getEvolutie() {
        return evolutie;
    }

    public void setEvolutie(String evolutie) {
        this.evolutie = evolutie;
    }

    public String getIstoricVaccinari() {
        return istoricVaccinari;
    }

    public void setIstoricVaccinari(String istoricVaccinari) {
        this.istoricVaccinari = istoricVaccinari;
    }

    public String getAlergii() {
        return alergii;
    }

    public void setAlergii(String alergii) {
        this.alergii = alergii;
    }

    public String getBoliCronice() {
        return boliCronice;
    }

    public void setBoliCronice(String boliCronice) {
        this.boliCronice = boliCronice;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public List<FisaConsultatie> getFiseConsultatii() {
        return fiseConsultatii;
    }

    public void setFiseConsultatii(List<FisaConsultatie> fiseConsultatii) {
        this.fiseConsultatii = fiseConsultatii;
    }

    public List<FisaInterventie> getFiseInterventii() {
        return fiseInterventii;
    }

    public void setFiseInterventii(List<FisaInterventie> fiseInterventii) {
        this.fiseInterventii = fiseInterventii;
    }
}
