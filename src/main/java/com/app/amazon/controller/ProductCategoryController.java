package com.app.amazon.controller;

import com.app.amazon.models.entity.ProductCategory;
import com.app.amazon.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product/categories")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    @PostMapping
    public ResponseEntity<ProductCategory> addProductCategory(@RequestBody ProductCategory productCategory) {
        ProductCategory createdProductCategory = productCategoryService.createProductCategory(productCategory);
        return new ResponseEntity<>(createdProductCategory, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ProductCategory> updateProductCategory(@RequestBody ProductCategory productCategory) {
        ProductCategory updatedProductCategory = productCategoryService.updateProductCategory(productCategory);
        return new ResponseEntity<>(updatedProductCategory, HttpStatus.OK);
    }

    @GetMapping("/{categoryID}")
    public ResponseEntity<ProductCategory> getProductCategory(@PathVariable Long categoryID) {
        ProductCategory retievedCategory = productCategoryService.getProductCategoryById(categoryID);
        return new ResponseEntity<>(retievedCategory, HttpStatus.OK);
    }

    @DeleteMapping("/{categoryID}")
    public ResponseEntity<ProductCategory> deleteProductCategory(@PathVariable Long categoryID) {
        ProductCategory productCategory = productCategoryService.deleteProductCategoryById(categoryID);
        return new ResponseEntity<>(productCategory, HttpStatus.OK);
    }
}
