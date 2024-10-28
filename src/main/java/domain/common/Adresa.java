package domain.common;
import jakarta.persistence.*;

@Entity
public class Adresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tara;
    private String judet;
    private String oras;
    private String strada;
    private String codPostal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public Adresa() {
    }

    public Adresa(Long id, String tara, String judet, String oras, String strada, String codPostal) {
        this.id = id;
        this.tara = tara;
        this.judet = judet;
        this.oras = oras;
        this.strada = strada;
        this.codPostal = codPostal;
    }


}

