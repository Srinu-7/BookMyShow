package com.Application.Demo.BookMyShow.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String ticketId = UUID.randomUUID().toString();

    String movieName;

    @CreationTimestamp
    Date showDateTime;

    Double totalAmount;

    String bookedSeats;

    String theaterName;
}
