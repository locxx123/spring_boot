package com.loc.java.study2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.loc.java.study2.dto.ProductDTO;
import com.loc.java.study2.model.Product;
@Repository
public interface  ProductRepository extends JpaRepository<Product,Long> {

    @Query(
        """
            SELECT new com.loc.java.study2.dto.ProductDTO(
                p.id,
                p.name,
                p.slug,
                p.image,
                p.category_id,
                p.price,
                p.price_old,
                p.description,
                i.img_desct
            ) 
                FROM Product p 
                JOIN Image i ON i.product_slug = p.slug WHERE p.slug = :slug
        """
    )
    List<ProductDTO> findProductBySlug(String slug);
    
}
