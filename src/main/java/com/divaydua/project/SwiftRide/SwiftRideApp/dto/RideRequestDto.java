package com.divaydua.project.SwiftRide.SwiftRideApp.dto;

import com.divaydua.project.SwiftRide.SwiftRideApp.entities.enums.PaymentMethod;
import com.divaydua.project.SwiftRide.SwiftRideApp.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {
    private Long id;

    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto rider;

    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;
}
