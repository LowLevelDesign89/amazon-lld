package com.app.amazon.models.entity;

import lombok.Data;

import java.util.List;

@Data
public class ShoppingCart {
    private Long cartId;
    private List<ProductLineItem> items;
    private Long userId;
}
