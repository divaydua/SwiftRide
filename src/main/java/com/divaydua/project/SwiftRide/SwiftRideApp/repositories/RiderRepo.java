package com.divaydua.project.SwiftRide.SwiftRideApp.repositories;

import com.divaydua.project.SwiftRide.SwiftRideApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepo extends JpaRepository<Rider, Long> {
}
