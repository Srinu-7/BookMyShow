package com.Application.Demo.BookMyShow.Model;
import com.Application.Demo.BookMyShow.Enum.SeatType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "show_seats")
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    boolean isBooked;

    int price;

    @Enumerated(value = EnumType.STRING)
    SeatType seatType;

    String seatNo;

    Date bookTime;
}
