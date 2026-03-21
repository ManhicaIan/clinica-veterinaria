package com.manhica.clinica_veterinaria.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(
        @NotBlank(message = "Email should not be empty")
        @Email(message = "Enter an valid email")
        String email,

        @NotBlank(message = "Password should not be empty")
        @Size(min = 6, max = 12, message = "Password should be between 6 and 12")
        String password
) {
}
