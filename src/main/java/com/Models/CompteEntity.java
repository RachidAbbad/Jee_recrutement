package com.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "compte", schema = "dbo", catalog = "jee_recrutement")
public class CompteEntity {
    private String ville;
    private String email;
    private String motDePasse;
    private String numTel;
    private int verifed;
    private String typeCompte;
    private int id;

    @Basic
    @Column(name = "ville")
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "mot_de_passe")
    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Basic
    @Column(name = "num_tel")
    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    @Basic
    @Column(name = "verifed")
    public int getVerifed() {
        return verifed;
    }

    public void setVerifed(int verifed) {
        this.verifed = verifed;
    }

    @Basic
    @Column(name = "type_compte")
    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompteEntity that = (CompteEntity) o;
        return verifed == that.verifed &&
                id == that.id &&
                Objects.equals(ville, that.ville) &&
                Objects.equals(email, that.email) &&
                Objects.equals(motDePasse, that.motDePasse) &&
                Objects.equals(numTel, that.numTel) &&
                Objects.equals(typeCompte, that.typeCompte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ville, email, motDePasse, numTel, verifed, typeCompte, id);
    }
}
