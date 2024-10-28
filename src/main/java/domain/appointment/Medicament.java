package domain.appointment;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeMedicament;
    private String descriere;
    private String forma;
    private LocalDate dataExpirare;
    private int stocDisponibil;
    private int pretPeUnitate;

    public Medicament(int pretPeUnitate, int stocDisponibil, LocalDate dataExpirare, String forma, String descriere, String numeMedicament, Long id) {
        this.pretPeUnitate = pretPeUnitate;
        this.stocDisponibil = stocDisponibil;
        this.dataExpirare = dataExpirare;
        this.forma = forma;
        this.descriere = descriere;
        this.numeMedicament = numeMedicament;
        this.id = id;
    }

    public Medicament() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public LocalDate getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(LocalDate dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public int getStocDisponibil() {
        return stocDisponibil;
    }

    public void setStocDisponibil(int stocDisponibil) {
        this.stocDisponibil = stocDisponibil;
    }

    public int getPretPeUnitate() {
        return pretPeUnitate;
    }

    public void setPretPeUnitate(int pretPeUnitate) {
        this.pretPeUnitate = pretPeUnitate;
    }
}
