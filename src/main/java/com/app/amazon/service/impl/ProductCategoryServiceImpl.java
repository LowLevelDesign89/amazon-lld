package com.app.amazon.service.impl;

import com.app.amazon.exception.BadRequestException;
import com.app.amazon.models.entity.Product;
import com.app.amazon.models.entity.ProductCategory;
import com.app.amazon.repository.ProductCategoryRepository;
import com.app.amazon.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private SearchServiceImpl searchService;

    @Override
    public ProductCategory createProductCategory(ProductCategory productCategory) {
        return productCategoryRepository.createProductCategory(productCategory);
    }

    @Override
    public ProductCategory updateProductCategory(ProductCategory productCategory) {
        return productCategoryRepository.updateProductCategory(productCategory);
    }

    @Override
    public ProductCategory getProductCategoryById(Long categoryId) {
        return productCategoryRepository.getProductCategory(categoryId);
    }

    @Override
    public ProductCategory deleteProductCategoryById(Long categoryId) {
        ProductCategory retrievedCategory = productCategoryRepository.getProductCategory(categoryId);
        List<Product> productList = searchService.searchByProductCategory(retrievedCategory.getCategoryName());
        // basically we will ask user to delete the products first under this category, then delete the category
        if(!productList.isEmpty()) {
            throw new BadRequestException("Category with ID " + categoryId + " has products in it," +
                    " so delete the products first or move those products under different category");
        }
        return productCategoryRepository.deleteProductCategory(categoryId);
    }
}
