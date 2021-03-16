package com.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "projet", schema = "dbo", catalog = "jee_recrutement")
public class ProjetEntity {
    private String titre;
    private String type;
    private int id;

    @Basic
    @Column(name = "titre")
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        ProjetEntity that = (ProjetEntity) o;
        return id == that.id &&
                Objects.equals(titre, that.titre) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, type, id);
    }
}
