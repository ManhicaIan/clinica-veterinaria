package com.manhica.clinica_veterinaria.controllers;

import com.manhica.clinica_veterinaria.dto.request.LoginRequest;
import com.manhica.clinica_veterinaria.dto.response.LoginResponse;
import com.manhica.clinica_veterinaria.services.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/auth/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }
}
