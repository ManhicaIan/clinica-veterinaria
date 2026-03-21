package com.manhica.clinica_veterinaria.services;

import com.manhica.clinica_veterinaria.dto.request.LoginRequest;
import com.manhica.clinica_veterinaria.dto.response.LoginResponse;
import com.manhica.clinica_veterinaria.entity.user.User;
import com.manhica.clinica_veterinaria.infra.security.TokenConfig;
import com.manhica.clinica_veterinaria.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenConfig tokenConfig;

    public LoginResponse login(LoginRequest request){
        if(userRepository.findByEmail(request.email()) == null) throw  new UsernameNotFoundException("User not found");
        var usernamePassword = new UsernamePasswordAuthenticationToken(request.email(), request.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);
        var token = tokenConfig.generateToken((User) auth.getPrincipal());
        return new LoginResponse(token);
    }
}
