package com.app.amazon.models.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Shipment {
    private Long id;
    private String shipmentMethod;
    private Order order;
    private Date createdDate;
    private List<ShipmentLog> shipmentLogs;
}
