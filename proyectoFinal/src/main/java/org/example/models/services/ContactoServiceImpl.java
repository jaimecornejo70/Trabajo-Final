package org.example.models.services;


import org.example.models.entities.Contacto;
import org.example.models.repositories.IContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ContactoServiceImpl implements IContactoService {

    @Autowired
    IContactoRepository contactoRepository;

    @Override
    public void create(Contacto contacto) {
        contactoRepository.save(contacto);
    }

    @Override
    public List<Contacto> readAll() { return contactoRepository.findAll(); }

  @Override
    public Optional<Contacto> readOne(Long idContacto) {
        return contactoRepository.findById(idContacto);
    }

    @Override
    public void update(Contacto contacto) {
        contactoRepository.save(contacto);
    }

}
