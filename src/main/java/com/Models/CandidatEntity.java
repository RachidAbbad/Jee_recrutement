package com.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "candidat", schema = "dbo", catalog = "jee_recrutement")
public class CandidatEntity {
    private String nomComplet;
    private String photoUrl;
    private String titreEmploi;
    private String civilite;
    private int id;

    @Basic
    @Column(name = "nom_complet")
    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    @Basic
    @Column(name = "photo_url")
    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Basic
    @Column(name = "titre_emploi")
    public String getTitreEmploi() {
        return titreEmploi;
    }

    public void setTitreEmploi(String titreEmploi) {
        this.titreEmploi = titreEmploi;
    }

    @Basic
    @Column(name = "civilite")
    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
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
        CandidatEntity that = (CandidatEntity) o;
        return id == that.id &&
                Objects.equals(nomComplet, that.nomComplet) &&
                Objects.equals(photoUrl, that.photoUrl) &&
                Objects.equals(titreEmploi, that.titreEmploi) &&
                Objects.equals(civilite, that.civilite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomComplet, photoUrl, titreEmploi, civilite, id);
    }
}
