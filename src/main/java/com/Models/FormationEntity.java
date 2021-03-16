package com.Models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "formation", schema = "dbo", catalog = "jee_recrutement")
public class FormationEntity {
    private String nomEtablissement;
    private String nomDiplome;
    private Timestamp duree;
    private int id;

    @Basic
    @Column(name = "nom_etablissement")
    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public void setNomEtablissement(String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

    @Basic
    @Column(name = "nom_diplome")
    public String getNomDiplome() {
        return nomDiplome;
    }

    public void setNomDiplome(String nomDiplome) {
        this.nomDiplome = nomDiplome;
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
        FormationEntity that = (FormationEntity) o;
        return id == that.id &&
                Objects.equals(nomEtablissement, that.nomEtablissement) &&
                Objects.equals(nomDiplome, that.nomDiplome) &&
                Objects.equals(duree, that.duree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomEtablissement, nomDiplome, duree, id);
    }
}
