package com.example.webshopspringh2console.Model;

import javax.persistence.*;

@Entity
@Table(name="COMPANYDESCRIPTION")
public class CompanyDescription
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;
    @Column(name = "description")
    String description;

    public CompanyDescription() {
    }

    public CompanyDescription(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CompanyDescription{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}