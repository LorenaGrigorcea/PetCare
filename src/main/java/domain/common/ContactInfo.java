package domain.common;

import jakarta.persistence.*;

@Entity
public class ContactInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numarTelefon;
    private String email;

    public ContactInfo(Long id, String numarTelefon, String email) {
        this.id = id;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    public ContactInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

