package com.app.amazon.models.entity;

import lombok.Data;

@Data
public class Address {
    private Long addressId;
    private String city;
    private String street;
    private String state;
    private String countryCode;
    private String zipCode;
}
