package domain.patient;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class IstoricMedical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataInregistrare;
    private String evolutie;

    private String detaliiMedicale;

    public String getDetaliiMedicale() {
        return detaliiMedicale;
    }

    public void setDetaliiMedicale(String detaliiMedicale) {
        this.detaliiMedicale = detaliiMedicale;
    }

    // Stocăm vaccinările într-un String formatat, dar le gestionăm ca o listă
    private String istoricVaccinari;  // Format: "Vaccin1:2024-12-31, Vaccin2:2025-06-15"

    private String alergii;
    private String boliCronice;

    @OneToOne(mappedBy = "istoricMedical")
    private Pacient pacient;

    @OneToMany(mappedBy = "istoricMedical", cascade = CascadeType.ALL)
    private List<FisaConsultatie> fiseConsultatii;

    @OneToMany(mappedBy = "istoricMedical", cascade = CascadeType.ALL)
    private List<FisaInterventie> fiseInterventii;

    // Constructori, Getteri și Setteri

    public IstoricMedical() {
    }

    public IstoricMedical(Long id, LocalDate dataInregistrare, String evolutie, String istoricVaccinari, String alergii, String boliCronice, Pacient pacient, List<FisaConsultatie> fiseConsultatii, List<FisaInterventie> fiseInterventii) {
        this.id = id;
        this.dataInregistrare = dataInregistrare;
        this.evolutie = evolutie;
        this.istoricVaccinari = istoricVaccinari;
        this.alergii = alergii;
        this.boliCronice = boliCronice;
        this.pacient = pacient;
        this.fiseConsultatii = fiseConsultatii;
        this.fiseInterventii = fiseInterventii;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataInregistrare() {
        return dataInregistrare;
    }

    public void setDataInregistrare(LocalDate dataInregistrare) {
        this.dataInregistrare = dataInregistrare;
    }

    public String getEvolutie() {
        return evolutie;
    }

    public void setEvolutie(String evolutie) {
        this.evolutie = evolutie;
    }

    public String getIstoricVaccinari() {
        return istoricVaccinari;
    }

    public void setIstoricVaccinari(String istoricVaccinari) {
        this.istoricVaccinari = istoricVaccinari;
    }

    public String getAlergii() {
        return alergii;
    }

    public void setAlergii(String alergii) {
        this.alergii = alergii;
    }

    public String getBoliCronice() {
        return boliCronice;
    }

    public void setBoliCronice(String boliCronice) {
        this.boliCronice = boliCronice;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public List<FisaConsultatie> getFiseConsultatii() {
        return fiseConsultatii;
    }

    public void setFiseConsultatii(List<FisaConsultatie> fiseConsultatii) {
        this.fiseConsultatii = fiseConsultatii;
    }

    public List<FisaInterventie> getFiseInterventii() {
        return fiseInterventii;
    }

    public void setFiseInterventii(List<FisaInterventie> fiseInterventii) {
        this.fiseInterventii = fiseInterventii;
    }

    // Metodă pentru a parsa detaliile vaccinurilor

    /**
     * Returnează o listă de vaccinări și datele lor de expirare.
     * Fiecare vaccinare este reprezentată ca un array cu numele vaccinului și data expirării.
     */
    public List<String[]> parseVaccinari() {
        List<String[]> vaccinariList = new ArrayList<>();

        // Split vaccinările după virgulă
        if (istoricVaccinari != null && !istoricVaccinari.isEmpty()) {
            String[] vaccinari = istoricVaccinari.split(",\\s*");
            for (String vaccinare : vaccinari) {
                // Split fiecare vaccin după două puncte
                String[] vaccinDetalii = vaccinare.split(":");
                if (vaccinDetalii.length == 2) {
                    vaccinariList.add(vaccinDetalii);  // vaccinDetalii[0] = nume, vaccinDetalii[1] = data expirării
                }
            }
        }
        return vaccinariList;
    }

    // Metodă pentru a obține data de expirare a unui vaccin din string
    public LocalDate getDataExpirareDinString(String vaccinare) {
        String[] parts = vaccinare.split(":");
        if (parts.length == 2) {
            return LocalDate.parse(parts[1]); // Format: "Vaccin1:2024-12-31"
        }
        return null;
    }

    // Metodă pentru a verifica dacă toate vaccinările sunt la zi
    public boolean areVaccinarileLaZi() {
        return parseVaccinari().stream()
                .map(vaccinare -> getDataExpirareDinString(vaccinare[1]))
                .allMatch(dataExpirare -> dataExpirare != null && dataExpirare.isAfter(LocalDate.now()));
    }
}
