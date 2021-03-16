package com.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "recruteur", schema = "dbo", catalog = "jee_recrutement")
public class RecruteurEntity {
    private String nom;
    private String description;
    private String siteweb;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "siteweb")
    public String getSiteweb() {
        return siteweb;
    }

    public void setSiteweb(String siteweb) {
        this.siteweb = siteweb;
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
        RecruteurEntity that = (RecruteurEntity) o;
        return id == that.id &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(description, that.description) &&
                Objects.equals(siteweb, that.siteweb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, description, siteweb, id);
    }
}
