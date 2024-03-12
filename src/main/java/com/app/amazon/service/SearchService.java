package com.app.amazon.service;

import com.app.amazon.models.entity.Product;

import java.util.List;

public interface SearchService {
    List<Product> searchByProductName(String name);
    List<Product> searchByProductCategory(String categoryName);
}
