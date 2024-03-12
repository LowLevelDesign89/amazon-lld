package com.app.amazon.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @PostMapping
    public void addProduct() {

    }

    @PutMapping
    public void updateProduct() {

    }

    @DeleteMapping
    public void deleteProduct() {

    }

    @PostMapping("/lineitem")
    public void addProductLineItem() {

    }

    @PutMapping("/lineitem")
    public void updateProductLineItem() {

    }

    @DeleteMapping("/lineitem")
    public void deleteProductLineItem() {

    }
}
