package com.manhica.clinica_veterinaria.dto.errors.validation;

import com.manhica.clinica_veterinaria.dto.errors.CustomErrorMessage;
import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CustomValidationError extends CustomErrorMessage {
    private List<FieldMessage> errors = new ArrayList<>();

    public CustomValidationError(Instant timestamp, int status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public void addError(String fieldName, String message){
        errors.add(new FieldMessage(fieldName, message));
    }

}
