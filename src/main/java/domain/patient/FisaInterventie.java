package domain.patient;

import jakarta.persistence.*;

@Entity
public class FisaInterventie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipInterventie;
    private String complicatii;

    @ManyToOne
    @JoinColumn(name = "istoricMedical_id")
    private IstoricMedical istoricMedical;

    public FisaInterventie(Long id, String tipInterventie, String complicatii, IstoricMedical istoricMedical) {
        this.id = id;
        this.tipInterventie = tipInterventie;
        this.complicatii = complicatii;
        this.istoricMedical = istoricMedical;
    }

    public FisaInterventie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipInterventie() {
        return tipInterventie;
    }

    public void setTipInterventie(String tipInterventie) {
        this.tipInterventie = tipInterventie;
    }

    public String getComplicatii() {
        return complicatii;
    }

    public void setComplicatii(String complicatii) {
        this.complicatii = complicatii;
    }

    public IstoricMedical getIstoricMedical() {
        return istoricMedical;
    }

    public void setIstoricMedical(IstoricMedical istoricMedical) {
        this.istoricMedical = istoricMedical;
    }
}

