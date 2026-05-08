package com.Inovatech.ms_register.controller;

import com.Inovatech.ms_register.dto.RegisterRequest;
import com.Inovatech.ms_register.dto.RegisterResponse;
import com.Inovatech.ms_register.service.RegisterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/register")
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerService;

    @PostMapping
    public RegisterResponse register(
            @Valid @RequestBody RegisterRequest request
    ) {
        return registerService.register(request);
    }
}