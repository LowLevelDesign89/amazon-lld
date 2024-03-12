package com.app.amazon.models.entity;

import com.app.amazon.models.enums.PaymentMethod;
import com.app.amazon.models.enums.PaymentStatus;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Payment {
    private Long id;
    private Member user;
    private PaymentMethod paymentMethod;
    private BigDecimal amount;
    private Order order;
    private PaymentStatus paymentStatus;
}
