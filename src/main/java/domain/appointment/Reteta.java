package domain.appointment;

import jakarta.persistence.*;

@Entity
public class Reteta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dozaPrescrisa;
    private String frecventa;

    @ManyToOne
    private Medicament medicament;

    public Reteta(Long id, String dozaPrescrisa, String frecventa, Medicament medicament) {
        this.id = id;
        this.dozaPrescrisa = dozaPrescrisa;
        this.frecventa = frecventa;
        this.medicament = medicament;
    }

    public Reteta() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDozaPrescrisa() {
        return dozaPrescrisa;
    }

    public void setDozaPrescrisa(String dozaPrescrisa) {
        this.dozaPrescrisa = dozaPrescrisa;
    }

    public String getFrecventa() {
        return frecventa;
    }

    public void setFrecventa(String frecventa) {
        this.frecventa = frecventa;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }
}

