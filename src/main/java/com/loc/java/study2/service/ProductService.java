package com.loc.java.study2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loc.java.study2.dto.ProductDTO;
import com.loc.java.study2.model.Product;
import com.loc.java.study2.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getProductBySlug(String slug) {
        return  productRepository.findProductBySlug(slug);
    }
}
