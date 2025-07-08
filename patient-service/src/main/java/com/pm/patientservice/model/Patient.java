package com.pm.patientservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    @NotNull
    String name;

    @NotNull
    @Email
    @Column(unique = true)
    String email;

    @NotNull
    String address;

    @NotNull
    LocalDate dateOfBirth;

    @NotNull
    LocalDate registeredDate;
}
