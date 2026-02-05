package com.fluxo.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fluxo.config.security.JwtService;
import com.fluxo.dto.LoginRequestDTO;
import com.fluxo.dto.LoginResponseDTO;
import com.fluxo.entity.Usuario;
import com.fluxo.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final UsuarioRepository usuarioRepository;



    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO dto) { 
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(dto.getEmail(), dto.getSenha())
        );
        Usuario usuario = usuarioRepository.findByEmail(dto.getEmail()).get();
        String token = jwtService.gerarToken(usuario);
        return new LoginResponseDTO(token);


    }



}
