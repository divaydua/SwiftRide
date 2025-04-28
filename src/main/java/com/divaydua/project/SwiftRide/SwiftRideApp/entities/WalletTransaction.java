package com.divaydua.project.SwiftRide.SwiftRideApp.entities;

import com.divaydua.project.SwiftRide.SwiftRideApp.entities.enums.TransactionStatus;
import com.divaydua.project.SwiftRide.SwiftRideApp.entities.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Entity
public class WalletTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private TransactionType transactionType;

    private TransactionStatus transactionStatus;

    @OneToOne
    private Ride ride;

    private String transactionId;

    @ManyToOne
    private Wallet wallet;

    @CreationTimestamp
    private LocalDateTime timeStamp;
}
