package com.manhica.clinica_veterinaria.controllers;

import com.manhica.clinica_veterinaria.dto.response.UserResponse;
import com.manhica.clinica_veterinaria.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public ResponseEntity<Page<UserResponse>> findAll(Pageable pageable){
        return ResponseEntity.ok(userService.findAll(pageable));
    }
}
