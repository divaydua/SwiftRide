package com.divaydua.project.SwiftRide.SwiftRideApp.repositories;

import com.divaydua.project.SwiftRide.SwiftRideApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepo extends JpaRepository<RideRequest, Long> {
}
