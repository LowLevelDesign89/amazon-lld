package com.app.amazon.repository;

import com.app.amazon.models.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductSearchRepository {
    private Map<String, List<Product>> productByNames = new HashMap<>();
    private Map<String, List<Product>> productByCategories = new HashMap<>();

    public List<Product> getProductByName(String productName) {
        return productByNames.getOrDefault(productName, new ArrayList<>());
    }

    public List<Product> getProductByCategory(String productCategoryName) {
        return productByCategories.getOrDefault(productCategoryName, new ArrayList<>());
    }
}
