package com.app.amazon.service;

import com.app.amazon.models.entity.ProductCategory;

public interface ProductCategoryService {
    ProductCategory createProductCategory(ProductCategory productCategory);

    ProductCategory updateProductCategory(ProductCategory productCategory);

    ProductCategory getProductCategoryById(Long categoryId);

    ProductCategory deleteProductCategoryById(Long categoryId);
}
