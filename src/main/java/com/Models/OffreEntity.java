package com.Models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "offre", schema = "dbo", catalog = "jee_recrutement")
public class OffreEntity {
    private int id;
    private String titre;
    private String description;
    private String emplacement;
    private String typeContrat;
    private String metier;
    private String salaireEtPrimes;
    private Date dateCréation;
    private String competencesRequises;
    private int idRecruteur;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "titre")
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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
    @Column(name = "emplacement")
    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    @Basic
    @Column(name = "type_contrat")
    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }

    @Basic
    @Column(name = "metier")
    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    @Basic
    @Column(name = "salaire_et_primes")
    public String getSalaireEtPrimes() {
        return salaireEtPrimes;
    }

    public void setSalaireEtPrimes(String salaireEtPrimes) {
        this.salaireEtPrimes = salaireEtPrimes;
    }

    @Basic
    @Column(name = "date_création")
    public Date getDateCréation() {
        return dateCréation;
    }

    public void setDateCréation(Date dateCréation) {
        this.dateCréation = dateCréation;
    }

    @Basic
    @Column(name = "competences_requises")
    public String getCompetencesRequises() {
        return competencesRequises;
    }

    public void setCompetencesRequises(String competencesRequises) {
        this.competencesRequises = competencesRequises;
    }

    @Basic
    @Column(name = "id_recruteur")
    public int getIdRecruteur() {
        return idRecruteur;
    }

    public void setIdRecruteur(int idRecruteur) {
        this.idRecruteur = idRecruteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OffreEntity that = (OffreEntity) o;
        return id == that.id &&
                idRecruteur == that.idRecruteur &&
                Objects.equals(titre, that.titre) &&
                Objects.equals(description, that.description) &&
                Objects.equals(emplacement, that.emplacement) &&
                Objects.equals(typeContrat, that.typeContrat) &&
                Objects.equals(metier, that.metier) &&
                Objects.equals(salaireEtPrimes, that.salaireEtPrimes) &&
                Objects.equals(dateCréation, that.dateCréation) &&
                Objects.equals(competencesRequises, that.competencesRequises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titre, description, emplacement, typeContrat, metier, salaireEtPrimes, dateCréation, competencesRequises, idRecruteur);
    }
}
