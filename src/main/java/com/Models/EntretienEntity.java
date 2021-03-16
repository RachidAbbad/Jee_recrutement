package com.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "entretien", schema = "dbo", catalog = "jee_recrutement")
public class EntretienEntity {
    private int id;
    private String resultat;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "resultat")
    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntretienEntity that = (EntretienEntity) o;
        return id == that.id &&
                Objects.equals(resultat, that.resultat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resultat);
    }
}
