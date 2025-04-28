package com.divaydua.project.SwiftRide.SwiftRideApp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.geo.Point;

import java.awt.*;

@Entity
@Getter
@Setter
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double rating;

    private Boolean available;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    Point currentLocation;
}
