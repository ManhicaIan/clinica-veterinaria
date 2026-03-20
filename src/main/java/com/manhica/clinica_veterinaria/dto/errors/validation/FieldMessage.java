package com.manhica.clinica_veterinaria.dto.errors.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FieldMessage {
    private String fieldName;
    private String message;
}
