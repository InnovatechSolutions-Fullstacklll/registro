package com.Inovatech.ms_register.controller;

import com.Inovatech.ms_register.dto.RegisterRequest;
import com.Inovatech.ms_register.dto.RegisterResponse;
import com.Inovatech.ms_register.entity.User;
import com.Inovatech.ms_register.repository.UserRepository;
import com.Inovatech.ms_register.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/register")
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerService;
    private final UserRepository userRepository;

    @PostMapping("/user")
    public RegisterResponse register(
            @RequestBody RegisterRequest request
    ) {
        System.out.println("Register request: " + request);
        return registerService.register(request);
    }
    @GetMapping("/user")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}