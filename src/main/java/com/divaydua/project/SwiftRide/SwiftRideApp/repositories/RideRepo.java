package com.divaydua.project.SwiftRide.SwiftRideApp.repositories;

import com.divaydua.project.SwiftRide.SwiftRideApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepo extends JpaRepository<Ride, Long> {
}
