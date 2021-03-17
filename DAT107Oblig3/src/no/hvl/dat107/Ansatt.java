package no.hvl.dat107;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema = "oblig3")
@NamedQuery(name = "hentAllePersoner", query = "SELECT * from ansatt")
public class Ansatt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ansatt_id;
    private String brukernavn;
    private String fornavn;
    private String etternavn;
    private LocalDate ansdato;
    private String stilling;
    private float mnd_lonn;
    private String avdeling;
    private int prosjekter;

    public Integer getAnsatt_id() {
        return ansatt_id;
    }

    public void setAnsatt_id(Integer ansatt_id) {
        this.ansatt_id = ansatt_id;
    }

    public String getBrukernavn() {
        return brukernavn;
    }

    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public LocalDate getAnsdato() {
        return ansdato;
    }

    public void setAnsdato(LocalDate ansdato) {
        this.ansdato = ansdato;
    }

    public String getStilling() {
        return stilling;
    }

    public void setStilling(String stilling) {
        this.stilling = stilling;
    }

    public float getMnd_lonn() {
        return mnd_lonn;
    }

    public void setMnd_lonn(float mnd_lonn) {
        this.mnd_lonn = mnd_lonn;
    }

    public String getAvdeling() {
        return avdeling;
    }

    public void setAvdeling(String avdeling) {
        this.avdeling = avdeling;
    }

    public int getProsjekter() {
        return prosjekter;
    }

    public void setProsjekter(int prosjekter) {
        this.prosjekter = prosjekter;
    }

    @Override
    public String toString() {
        return "no.hvl.dat107.ansatt{" +
                "ansatt_id=" + ansatt_id +
                ", brukernavn='" + brukernavn + '\'' +
                ", fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", ansdato=" + ansdato +
                ", stilling='" + stilling + '\'' +
                ", mnd_lonn=" + mnd_lonn +
                ", avdeling='" + avdeling + '\'' +
                ", prosjekter=" + prosjekter +
                '}';
    }
}


