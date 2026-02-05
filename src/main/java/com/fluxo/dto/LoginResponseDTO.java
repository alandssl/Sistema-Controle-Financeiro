package com.fluxo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDTO {

    private String token;
    private String tipo = "Bearer";
    private String email;

    public LoginResponseDTO(String token) {
        this.token = token;
    }
}

