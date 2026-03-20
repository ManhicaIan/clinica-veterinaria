package com.manhica.clinica_veterinaria.services;

import com.manhica.clinica_veterinaria.dto.response.UserResponse;
import com.manhica.clinica_veterinaria.entity.user.User;
import com.manhica.clinica_veterinaria.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Page<UserResponse> findAll(Pageable pageable){
        Page<User> users = userRepository.findAll(pageable);
        return users.map(user -> UserResponse.from(user));
    }
}
