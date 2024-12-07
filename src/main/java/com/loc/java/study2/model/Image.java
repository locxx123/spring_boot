package com.loc.java.study2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="img_desct")
public class Image {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private long id;

    @Column(name="img_desct")
    private String img_desct;

    @Column(name="product_slug")
    private String product_slug;

    public Image(long id, String img_desct, String product_slug) {
        this.id = id;
        this.img_desct = img_desct;
        this.product_slug = product_slug;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImg_desct() {
        return img_desct;
    }

    public void setImg_desct(String img_desct) {
        this.img_desct = img_desct;
    }

    public String getProduct_slug() {
        return product_slug;
    }

    public void setProduct_slug(String product_slug) {
        this.product_slug = product_slug;
    }

    
}
