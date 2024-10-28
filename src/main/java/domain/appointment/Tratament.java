package domain.appointment;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Tratament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataInceput;
    private LocalDate dataSfarsit;
    private String detaliiTratament;

    @OneToOne(cascade = CascadeType.ALL)
    private Reteta reteta;

    public Tratament(Long id, LocalDate dataInceput, LocalDate dataSfarsit, String detaliiTratament, Reteta reteta) {
        this.id = id;
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
        this.detaliiTratament = detaliiTratament;
        this.reteta = reteta;
    }

    public Tratament() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(LocalDate dataInceput) {
        this.dataInceput = dataInceput;
    }

    public LocalDate getDataSfarsit() {
        return dataSfarsit;
    }

    public void setDataSfarsit(LocalDate dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
    }

    public String getDetaliiTratament() {
        return detaliiTratament;
    }

    public void setDetaliiTratament(String detaliiTratament) {
        this.detaliiTratament = detaliiTratament;
    }

    public Reteta getReteta() {
        return reteta;
    }

    public void setReteta(Reteta reteta) {
        this.reteta = reteta;
    }
}

