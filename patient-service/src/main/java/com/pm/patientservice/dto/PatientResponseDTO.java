package com.pm.patientservice.dto;

import lombok.Data;

@Data
public class PatientResponseDTO {
    String id;
    String name;
    String email;
    String address;
    String dateOfBirth;
}
