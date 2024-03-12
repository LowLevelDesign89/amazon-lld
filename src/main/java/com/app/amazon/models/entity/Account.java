package com.app.amazon.models.entity;

import com.app.amazon.models.enums.AccountStatus;
import lombok.Data;

import java.util.List;

@Data
public class Account {
    private Long accountId;
    private String userName;
    private String password;
    private String phoneNumber;
    private List<Address> shippingAddress;
    private AccountStatus status;
}
