package com.pm.patientservice.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientResponseDto {
    private String id;
    private String name;
    private String email;
    private String address;
    private LocalDate dateOfBirth;
}
