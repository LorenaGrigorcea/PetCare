package domain.user_clinic;

import domain.common.Adresa;
import domain.common.ContactInfo;
import domain.common.Status;
import jakarta.persistence.*;

@Entity
public class Utilizator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;
    private String email;
    private String parola;

    @OneToOne(cascade = CascadeType.ALL)
    private ContactInfo contactInfo;

    @OneToOne(cascade = CascadeType.ALL)
    private Adresa address;

    private String rol;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Utilizator(Long id, String nume, String email, String parola, ContactInfo contactInfo, Adresa address, String rol, Status status) {
        this.id = id;
        this.nume = nume;
        this.email = email;
        this.parola = parola;
        this.contactInfo = contactInfo;
        this.address = address;
        this.rol = rol;
        this.status = status;
    }

    public Utilizator() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Adresa getAddress() {
        return address;
    }

    public void setAddress(Adresa address) {
        this.address = address;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

