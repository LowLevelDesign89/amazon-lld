package com.app.amazon.models.entity;

import lombok.Data;

import java.util.List;

@Data
public class Member extends Account {
    private ShoppingCart cart;
    private List<PaymentMethodDetails> paymentMethods;
}
