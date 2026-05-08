package com.Inovatech.ms_register.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterResponse {

    private String message;
    private String username;
    private String email;
}
