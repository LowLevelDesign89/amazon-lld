package com.app.amazon.models.entity;

import com.app.amazon.models.enums.OrderStatus;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Order {
    private Long id;
    private List<ProductLineItem> productLineItemList;
    private Member member;
    private OrderStatus orderStatus;
    private Date createdDate;
    private Date lastUpdatedDate;
}
