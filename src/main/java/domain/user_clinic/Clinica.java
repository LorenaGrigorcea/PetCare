package domain.user_clinic;

import domain.common.Adresa;
import domain.common.ContactInfo;
import jakarta.persistence.*;
import java.util.List;


@Entity
public class Clinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;

    @OneToOne(cascade = CascadeType.ALL)
    private Adresa address;

    @OneToOne(cascade = CascadeType.ALL)
    private ContactInfo contactInfo;

    private String programDeFunctionare;

    @OneToMany(mappedBy = "clinica", cascade = CascadeType.ALL)
    private List<Medic> listaMedici;

    public Clinica() {
    }

    public Clinica(Long id, String nume, Adresa address, ContactInfo contactInfo, String programDeFunctionare, List<Medic> listaMedici) {
        this.id = id;
        this.nume = nume;
        this.address = address;
        this.contactInfo = contactInfo;
        this.programDeFunctionare = programDeFunctionare;
        this.listaMedici = listaMedici;
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

    public Adresa getAddress() {
        return address;
    }

    public void setAddress(Adresa address) {
        this.address = address;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getProgramDeFunctionare() {
        return programDeFunctionare;
    }

    public void setProgramDeFunctionare(String programDeFunctionare) {
        this.programDeFunctionare = programDeFunctionare;
    }

    public List<Medic> getListaMedici() {
        return listaMedici;
    }

    public void setListaMedici(List<Medic> listaMedici) {
        this.listaMedici = listaMedici;
    }
}
