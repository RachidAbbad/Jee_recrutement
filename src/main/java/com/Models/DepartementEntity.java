package com.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "departement", schema = "dbo", catalog = "jee_recrutement")
public class DepartementEntity {
    private int id;
    private String nom;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartementEntity that = (DepartementEntity) o;
        return id == that.id &&
                Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }
}
