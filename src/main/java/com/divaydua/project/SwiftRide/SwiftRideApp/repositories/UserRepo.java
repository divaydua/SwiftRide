package com.divaydua.project.SwiftRide.SwiftRideApp.repositories;

import com.divaydua.project.SwiftRide.SwiftRideApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
