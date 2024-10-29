package domain.appointment;

import domain.common.StareProgramare;
import domain.common.TipServiciu;
import domain.patient.FisaConsultatie;
import domain.patient.Pacient;
import domain.user_clinic.Medic;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Programare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipServiciu tipServiciu;

    private LocalDate data;
    private LocalTime oraIncepere;
    private LocalTime oraSfarsit;
    private String sala;
    private String detalii;

    @Enumerated(EnumType.STRING)
    private StareProgramare stareProgramare;

    @ManyToOne
    @JoinColumn(name = "medic_id")
    private Medic medic;

    @ManyToOne
    @JoinColumn(name = "pacient_id")
    private Pacient pacient;

    @OneToOne(cascade = CascadeType.ALL)
    private FisaConsultatie fisaConsultatie;

    // Constructori, Getteri și Setteri

    public Programare(Long id, TipServiciu tipServiciu, LocalDate data, LocalTime oraIncepere, LocalTime oraSfarsit, String sala, String detalii, StareProgramare stareProgramare, Medic medic, Pacient pacient, FisaConsultatie fisaConsultatie) {
        this.id = id;
        this.tipServiciu = tipServiciu;
        this.data = data;
        this.oraIncepere = oraIncepere;
        this.oraSfarsit = oraSfarsit;
        this.sala = sala;
        this.detalii = detalii;
        this.stareProgramare = stareProgramare;
        this.medic = medic;
        this.pacient = pacient;
        this.fisaConsultatie = fisaConsultatie;
    }

    public Programare() {
    }

    // Getteri și Setteri

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipServiciu getTipServiciu() {
        return tipServiciu;
    }

    public void setTipServiciu(TipServiciu tipServiciu) {
        this.tipServiciu = tipServiciu;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public StareProgramare getStareProgramare() {
        return stareProgramare;
    }

    public void setStareProgramare(StareProgramare stareProgramare) {
        this.stareProgramare = stareProgramare;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public FisaConsultatie getFisaConsultatie() {
        return fisaConsultatie;
    }

    public void setFisaConsultatie(FisaConsultatie fisaConsultatie) {
        this.fisaConsultatie = fisaConsultatie;
    }
}
