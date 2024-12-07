package com.loc.java.study2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loc.java.study2.dto.ProductDTO;
import com.loc.java.study2.model.Product;
import com.loc.java.study2.service.ProductService;

@RestController
@RequestMapping
public class ProductController {
    @Autowired
    private ProductService productService;
     @GetMapping("/api/bySlug")
    public List<ProductDTO> getProductDetail(@RequestParam String slug) {
        return productService.getProductBySlug(slug);
    }
}
