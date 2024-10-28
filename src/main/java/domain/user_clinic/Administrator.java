package domain.user_clinic;

import jakarta.persistence.*;

@Entity
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "utilizator_id", referencedColumnName = "id")
    private Utilizator utilizator;

    @OneToOne
    @JoinColumn(name = "clinica_id", referencedColumnName = "id")
    private Clinica clinica;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilizator getUtilizator() {
        return utilizator;
    }

    public void setUtilizator(Utilizator utilizator) {
        this.utilizator = utilizator;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Administrator(Long id, Utilizator utilizator, Clinica clinica) {
        this.id = id;
        this.utilizator = utilizator;
        this.clinica = clinica;
    }

    public Administrator() {

    }
}

