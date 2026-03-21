package com.manhica.clinica_veterinaria.controllers;

import com.manhica.clinica_veterinaria.dto.request.LoginRequest;
import com.manhica.clinica_veterinaria.dto.request.RegisterRequest;
import com.manhica.clinica_veterinaria.dto.response.LoginResponse;
import com.manhica.clinica_veterinaria.dto.response.RegisterResponse;
import com.manhica.clinica_veterinaria.services.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/auth/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }
    @PostMapping("/auth/register")
    public ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(authService.register(request));
    }
}
