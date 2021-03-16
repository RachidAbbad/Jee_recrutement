package com.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cv", schema = "dbo", catalog = "jee_recrutement")
public class CvEntity {
    private int id;
    private String description;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CvEntity cvEntity = (CvEntity) o;
        return id == cvEntity.id &&
                Objects.equals(description, cvEntity.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }
}
