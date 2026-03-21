package com.manhica.clinica_veterinaria.dto.response;

import com.manhica.clinica_veterinaria.entity.user.User;
import com.manhica.clinica_veterinaria.entity.user.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDateTime;

public record RegisterResponse(
        String name,

        String email,

        UserRole role,

        boolean status,

        LocalDateTime createdAt
) {
    public RegisterResponse(User user){
        this(
            user.getName(),
            user.getEmail(),
            user.getRole(),
            user.isStatus(),
            user.getCreatedAt()
        );
    }
}
