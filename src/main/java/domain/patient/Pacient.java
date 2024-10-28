package domain.patient;
import domain.appointment.Programare;
import domain.common.Status;
import domain.user_clinic.Proprietar;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Pacient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;
    private String specie;
    private String rasa;
    private String sex;
    private int varsta;
    private double greutate;
    private LocalDate dataNasterii;
    private boolean sterilizat;
    private boolean microcip;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(cascade = CascadeType.ALL)
    private IstoricMedical istoricMedical;

    @OneToMany(mappedBy = "pacient", cascade = CascadeType.ALL)
    private List<Programare> programari;

    @ManyToOne
    @JoinColumn(name = "proprietar_id", referencedColumnName = "id")
    private Proprietar proprietar;


    public Pacient(Long id, String nume, String specie, String rasa, String sex, int varsta, double greutate, LocalDate dataNasterii, boolean sterilizat, boolean microcip, Status status, IstoricMedical istoricMedical, List<Programare> programari) {
        this.id = id;
        this.nume = nume;
        this.specie = specie;
        this.rasa = rasa;
        this.sex = sex;
        this.varsta = varsta;
        this.greutate = greutate;
        this.dataNasterii = dataNasterii;
        this.sterilizat = sterilizat;
        this.microcip = microcip;
        this.status = status;
        this.istoricMedical = istoricMedical;
        this.programari = programari;
    }

    public Pacient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public LocalDate getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(LocalDate dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public boolean isSterilizat() {
        return sterilizat;
    }

    public void setSterilizat(boolean sterilizat) {
        this.sterilizat = sterilizat;
    }

    public boolean isMicrocip() {
        return microcip;
    }

    public void setMicrocip(boolean microcip) {
        this.microcip = microcip;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public IstoricMedical getIstoricMedical() {
        return istoricMedical;
    }

    public void setIstoricMedical(IstoricMedical istoricMedical) {
        this.istoricMedical = istoricMedical;
    }

    public List<Programare> getProgramari() {
        return programari;
    }

    public void setProgramari(List<Programare> programari) {
        this.programari = programari;
    }
}

