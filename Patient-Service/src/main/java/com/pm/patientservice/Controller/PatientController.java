package com.pm.patientservice.Controller;

import com.pm.patientservice.DTO.PatientResponseDto;
import com.pm.patientservice.Service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @GetMapping
    public ResponseEntity<List<PatientResponseDto>> getAllPatients() {
       List<PatientResponseDto> patients=patientService.getAllPatients();
       return ResponseEntity.ok(patients);
    }
}
