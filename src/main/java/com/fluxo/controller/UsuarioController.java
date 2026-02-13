package com.fluxo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fluxo.dto.UsuarioCreateDTO;
import com.fluxo.dto.UsuarioResponseDTO;
import com.fluxo.service.UsuarioService;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping("/usuarios")
    public UsuarioResponseDTO criarUsuario(@RequestBody UsuarioCreateDTO usuario){
        return service.criarUsuario(usuario);
    }

    

}
