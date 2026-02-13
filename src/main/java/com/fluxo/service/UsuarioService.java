package com.fluxo.service;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fluxo.dto.UsuarioCreateDTO;
import com.fluxo.dto.UsuarioResponseDTO;
import com.fluxo.entity.Usuario;
import com.fluxo.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final PasswordEncoder passwordEncoder;

    public List<UsuarioResponseDTO> listarUsuarios() {
        return repository.findAll()
            .stream()
            .map(UsuarioResponseDTO::new)
            .toList();
    }

    public UsuarioResponseDTO buscarPorId(Long id) {
        Usuario usuario = repository.findById(id).
        orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        return new UsuarioResponseDTO(usuario);
    }

    public UsuarioResponseDTO criarUsuario(UsuarioCreateDTO dto) {
        // converter de DTO -> entidade
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
    
        // CRIPTOGRAFAR SENHA
        String senhaHash = passwordEncoder.encode(dto.getSenha());
        usuario.setSenha(senhaHash);

        Usuario salvo = repository.save(usuario);

        return new UsuarioResponseDTO(salvo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }   
}
