package com.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lettremotivation", schema = "dbo", catalog = "jee_recrutement")
public class LettremotivationEntity {
    private String body;
    private int id;

    @Basic
    @Column(name = "body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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
        LettremotivationEntity that = (LettremotivationEntity) o;
        return id == that.id &&
                Objects.equals(body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, id);
    }
}
