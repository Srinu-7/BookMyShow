package com.Application.Demo.BookMyShow.Model;

import com.Application.Demo.BookMyShow.Enum.Genre;
import com.Application.Demo.BookMyShow.Enum.Language;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(unique = true,nullable = false)
    String name;

    Double rating;

    @Enumerated(value = EnumType.STRING)
    Genre genre;

    int duration;

    @Enumerated(value = EnumType.STRING)
    Language language;
}
