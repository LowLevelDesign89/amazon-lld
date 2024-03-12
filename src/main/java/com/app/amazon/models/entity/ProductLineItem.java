package com.app.amazon.models.entity;


import com.app.amazon.models.enums.LineItemStatus;
import lombok.Data;

@Data
public class ProductLineItem {
    private Long productId;
    private Long lineItemId;
    private LineItemStatus lineItemStatus;
}
