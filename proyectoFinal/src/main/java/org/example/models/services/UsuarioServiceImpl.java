package org.example.models.services;

import org.example.models.entities.Usuario;
import org.example.models.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
     IUsuarioRepository usuarioRepository;

    @Override
    public void create(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> readAll() { return usuarioRepository.findAll(); }

    @Override
    public Optional<Usuario> readOne(Long idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }

    @Override
    public void update(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Long idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }
}
