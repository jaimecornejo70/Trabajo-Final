package org.example.models.services;

import org.example.models.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    public void create (Usuario usuario);
    public List<Usuario> readAll();
    public Optional<Usuario> readOne(Long idUsuario);
    public void update(Usuario usuario);
    public void delete (Long idUsuario);
}
