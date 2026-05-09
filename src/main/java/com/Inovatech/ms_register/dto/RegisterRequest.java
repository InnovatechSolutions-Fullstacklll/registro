package com.Inovatech.ms_register.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    @NotBlank(message = "Usuario obligatorio")
    private String username;

    @Email(message = "Email inválido")
    @NotBlank(message = "Email es obligatorio")
    private String email;

    @NotBlank(message = "Contraseña obligatorio")
    private String password;
}
