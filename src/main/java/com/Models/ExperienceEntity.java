package com.Models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "experience", schema = "dbo", catalog = "jee_recrutement")
public class ExperienceEntity {
    private String nomEntreprise;
    private String sujet;
    private String type;
    private Timestamp duree;
    private int id;

    @Basic
    @Column(name = "nom_entreprise")
    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    @Basic
    @Column(name = "sujet")
    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "duree")
    public Timestamp getDuree() {
        return duree;
    }

    public void setDuree(Timestamp duree) {
        this.duree = duree;
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
        ExperienceEntity that = (ExperienceEntity) o;
        return id == that.id &&
                Objects.equals(nomEntreprise, that.nomEntreprise) &&
                Objects.equals(sujet, that.sujet) &&
                Objects.equals(type, that.type) &&
                Objects.equals(duree, that.duree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomEntreprise, sujet, type, duree, id);
    }
}
