package com.Application.Demo.BookMyShow.Model;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    int age;

    @Column(unique = true,nullable = false)
    String email;

    @Column(unique = true,nullable = false)
    String mobile;

    String address;
}