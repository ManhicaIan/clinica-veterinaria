package com.manhica.clinica_veterinaria.dto.request;

import com.manhica.clinica_veterinaria.entity.user.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(

        @NotBlank(message = "Name should not be empty")
        @Size(min = 3, max = 50, message = "Name should be between 3 and 80")
        String name,

        @NotBlank(message = "Email should not be empty")
        @Email(message = "Enter an valid email")
        String email,

        @NotBlank(message = "Password should not be empty")
        @Size(min = 6, max = 12, message = "Password should be between 6 and 12")
        String password,

        UserRole role
) {
}
