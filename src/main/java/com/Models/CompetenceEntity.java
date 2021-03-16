package com.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "competence", schema = "dbo", catalog = "jee_recrutement")
public class CompetenceEntity {
    private String nom;
    private String type;
    private String niveau;
    private int id;

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
    @Column(name = "niveau")
    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
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
        CompetenceEntity that = (CompetenceEntity) o;
        return id == that.id &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(type, that.type) &&
                Objects.equals(niveau, that.niveau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, type, niveau, id);
    }
}
