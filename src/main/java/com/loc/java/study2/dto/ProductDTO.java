package com.loc.java.study2.dto;

public class ProductDTO {
    private Long id;

    private String name;

    private String slug;

    private String image;

    private String img_desct;

    private int category_id;

    private String price;

    private String price_old;

    private String description;

    public ProductDTO(String img_desct,Long id, String name, String slug, String image, int category_id, String price, String price_old,
            String description) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.image = image;
        this.category_id = category_id;
        this.price = price;
        this.price_old = price_old;
        this.description = description;
        this.img_desct = img_desct;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
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

    public String getImg_desct() {
        return img_desct;
    }

    public void setImg_desct(String img_desct) {
        this.img_desct = img_desct;
    }
}
