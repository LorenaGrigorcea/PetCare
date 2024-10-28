package domain.patient;

import jakarta.persistence.*;

@Entity
public class FisaConsultatie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String simptome;
    private String diagnostic;
    private String prescriptie;

    @ManyToOne
    @JoinColumn(name = "istoricMedical_id")
    private IstoricMedical istoricMedical;

    public FisaConsultatie(Long id, String simptome, String diagnostic, String prescriptie, IstoricMedical istoricMedical) {
        this.id = id;
        this.simptome = simptome;
        this.diagnostic = diagnostic;
        this.prescriptie = prescriptie;
        this.istoricMedical = istoricMedical;
    }

    public FisaConsultatie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSimptome() {
        return simptome;
    }

    public void setSimptome(String simptome) {
        this.simptome = simptome;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getPrescriptie() {
        return prescriptie;
    }

    public void setPrescriptie(String prescriptie) {
        this.prescriptie = prescriptie;
    }

    public IstoricMedical getIstoricMedical() {
        return istoricMedical;
    }

    public void setIstoricMedical(IstoricMedical istoricMedical) {
        this.istoricMedical = istoricMedical;
    }
}
