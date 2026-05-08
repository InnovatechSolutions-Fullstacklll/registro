package com.Inovatech.ms_register.service;

import com.Inovatech.ms_register.dto.RegisterRequest;
import com.Inovatech.ms_register.dto.RegisterResponse;
import com.Inovatech.ms_register.entity.User;
import com.Inovatech.ms_register.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/*de prueba, solo para postman*/

@Service
@RequiredArgsConstructor
public class RegisterService {

    private final PasswordEncoder passwordEncoder;

    public RegisterResponse register(RegisterRequest request) {

        User user = User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();

        return RegisterResponse.builder()
                .message("Usuario registrado correctamente")
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }
}





/*
Este register es para cuando este funcando una base de datos real, el otro es para postman nada más

@Service
@RequiredArgsConstructor
public class RegisterService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public RegisterResponse register(RegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("El email ya está registrado");
        }

        User user = User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();

        userRepository.save(user);

        return RegisterResponse.builder()
                .message("Usuario registrado correctamente")
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }
}*/