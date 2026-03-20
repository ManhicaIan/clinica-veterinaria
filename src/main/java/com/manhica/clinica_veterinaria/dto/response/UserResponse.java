package com.manhica.clinica_veterinaria.dto.response;

import com.manhica.clinica_veterinaria.entity.user.User;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String email,
        boolean status
) {
    public static UserResponse from(User user) {
        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.isStatus()
        );
    }


}
