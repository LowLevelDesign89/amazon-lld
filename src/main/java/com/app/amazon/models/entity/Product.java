package com.app.amazon.models.entity;

import lombok.Data;

@Data
public class Product {
    private Long productId;
    private String productName;
    private String description;
    private ProductCategory productCategory;
    private Double productPrice;
}
