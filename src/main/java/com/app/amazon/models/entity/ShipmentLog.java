package com.app.amazon.models.entity;

import com.app.amazon.models.enums.ShipmentStatus;
import lombok.Data;

import java.util.Date;

@Data
public class ShipmentLog {
    private Long id;
    private ShipmentStatus status;
    private Date createdDate;
}
