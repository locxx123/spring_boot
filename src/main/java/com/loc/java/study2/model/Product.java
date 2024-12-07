package com.loc.java.study2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private long id;

    @Column(name="name")
    private String name;

    @Column(name="slug")
    private String slug;

    @Column(name="image")
    private String image;

    @Column(name="category_id")
    private int category_id;

    @Column(name="price")
    private String price;

    @Column(name="price_old")
    private String price_old;

    @Column(name="description")
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Product(long id, String name, String slug, String image, int category_id, String price, String price_old,
            String description) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.image = image;
        this.category_id = category_id;
        this.price = price;
        this.price_old = price_old;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getCategoryId() {
        return category_id;
    }

    public void setCategoryId(int category_id) {
        this.category_id = category_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice_old() {
        return price_old;
    }

    public void setPrice_old(String price_old) {
        this.price_old = price_old;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}