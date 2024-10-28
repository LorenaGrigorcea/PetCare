package domain.user_clinic;

import domain.patient.Pacient;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Proprietar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "utilizator_id", referencedColumnName = "id")
    private Utilizator utilizator;

    @OneToMany(mappedBy = "proprietar", cascade = CascadeType.ALL)
    private List<Pacient> pacienti;


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

    public List<Pacient> getPacienti() {
        return pacienti;
    }

    public void setPacienti(List<Pacient> pacienti) {
        this.pacienti = pacienti;
    }

    public Proprietar(Long id, Utilizator utilizator, List<Pacient> pacienti) {
        this.id = id;
        this.utilizator = utilizator;
        this.pacienti = pacienti;
    }

    public Proprietar() {
    }
}

