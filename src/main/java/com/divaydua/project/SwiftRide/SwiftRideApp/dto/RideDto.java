package com.divaydua.project.SwiftRide.SwiftRideApp.dto;

import com.divaydua.project.SwiftRide.SwiftRideApp.entities.enums.PaymentMethod;
import com.divaydua.project.SwiftRide.SwiftRideApp.entities.enums.RideStatus;
import lombok.Data;
import org.springframework.data.geo.Point;

import java.time.LocalDateTime;
@Data
public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;

    private LocalDateTime createdTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
