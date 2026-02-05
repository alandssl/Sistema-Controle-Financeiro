package com.fluxo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fluxo.entity.Usuario;
import com.fluxo.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id).
        orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public Usuario criarUsuario(Usuario usuario) {
        usuario.setCreatedAt(LocalDateTime.now());
        return repository.save(usuario);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }   
}
