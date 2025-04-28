package com.divaydua.project.SwiftRide.SwiftRideApp.repositories;

import com.divaydua.project.SwiftRide.SwiftRideApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver,Long> {
}
