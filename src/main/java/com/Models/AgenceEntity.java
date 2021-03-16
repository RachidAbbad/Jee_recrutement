package com.Models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "agence", schema = "dbo", catalog = "jee_recrutement")
public class AgenceEntity {
    private int id;
    private String nom;
    private String description;
    private String adresse;
    private String motDePasse;

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "adresse")
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "mot_de_passe")
    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgenceEntity that = (AgenceEntity) o;
        return Objects.equals(nom, that.nom) &&
                Objects.equals(description, that.description) &&
                Objects.equals(adresse, that.adresse) &&
                Objects.equals(motDePasse, that.motDePasse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, description, adresse, motDePasse);
    }


}
