package com.app.amazon.models.entity;

import lombok.Data;

@Data
public class PaymentMethodDetails {
    private Long userId;
    private String name;
    private PaymentMethodDetails details;
    private String description; // normally for card it will card number, for UPI it will be UPI ID
}
