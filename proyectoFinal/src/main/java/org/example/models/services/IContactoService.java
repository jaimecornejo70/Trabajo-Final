package org.example.models.services;

import org.example.models.entities.Contacto;

import java.util.List;
import java.util.Optional;

public interface IContactoService {

    public void create (Contacto contacto);
    public List<Contacto> readAll();
    public Optional<Contacto> readOne(Long idContacto);
    public void update(Contacto contacto);


}
