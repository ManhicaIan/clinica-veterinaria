package com.manhica.clinica_veterinaria.dto.errors;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public class CustomErrorMessage {
    private Instant timestamp;
    private int status;
    private String error;
    private String path;
}
