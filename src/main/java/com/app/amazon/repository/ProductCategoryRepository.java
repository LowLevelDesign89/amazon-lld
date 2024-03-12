package com.app.amazon.repository;

import com.app.amazon.exception.NotFoundException;
import com.app.amazon.models.entity.ProductCategory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductCategoryRepository {
    private Map<Long, ProductCategory> map = new HashMap<>();

    private AtomicLong categoryId = new AtomicLong(1l);

    public ProductCategory createProductCategory(ProductCategory productCategory) {
        productCategory.setCategoryId(categoryId.get());
        map.put(productCategory.getCategoryId(), productCategory);
        categoryId.incrementAndGet();
        return productCategory;
    }

    public ProductCategory updateProductCategory(ProductCategory inputProductCategory) {
        ProductCategory retrivedCategory = getProductCategory(inputProductCategory.getCategoryId());
        retrivedCategory.setCategoryName(inputProductCategory.getCategoryName());
        map.put(inputProductCategory.getCategoryId(), retrivedCategory);
        return retrivedCategory;
    }

    public ProductCategory deleteProductCategory(Long categoryId) {
        ProductCategory retrievedCategory = getProductCategory(categoryId);
        map.remove(retrievedCategory.getCategoryId());
        return retrievedCategory;
    }

    public ProductCategory getProductCategory(Long categoryId) {
        ProductCategory retrivedCategory = map.get(categoryId);
        if(retrivedCategory == null) {
            // throw new exception
            throw new NotFoundException("Category with ID " + categoryId + " not found in the system");
        }
        return retrivedCategory;
    }

}
