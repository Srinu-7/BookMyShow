package com.Application.Demo.BookMyShow.Model;

import com.Application.Demo.BookMyShow.Enum.ShowType;
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
@Table(name = "shows")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    Date showDateTime;

    Date showCreatedOn;

    Date showUpdatedOn;

    @Enumerated(value = EnumType.STRING)
    ShowType showType;

}
