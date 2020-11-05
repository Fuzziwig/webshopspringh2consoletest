package com.example.webshopspringh2console.Model;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTDESCRIPTION")
public class ProductDescription
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;
    @Column(name = "description")
    String description;

    @OneToOne
    private Product product;

    public ProductDescription() {
    }

    public ProductDescription(long id, String description) {
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