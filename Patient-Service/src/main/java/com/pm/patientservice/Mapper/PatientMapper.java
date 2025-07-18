package com.pm.patientservice.Mapper;

import com.pm.patientservice.DTO.PatientResponseDto;
import com.pm.patientservice.Entity.Patient;

public class PatientMapper {
    public static PatientResponseDto toDTO(Patient patient){
        PatientResponseDto patientResponseDto = new PatientResponseDto();
        patientResponseDto.setId(patient.getId().toString());
        patientResponseDto.setName(patient.getName());
        patientResponseDto.setAddress(patient.getAddress());
        patientResponseDto.setEmail(patient.getEmail());
        patientResponseDto.setDateOfBirth(patient.getDateOfBirth());
        return patientResponseDto;
    }
}
