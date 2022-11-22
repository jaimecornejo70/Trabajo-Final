package org.example.models.services;

import org.example.models.entities.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    public void create (Producto producto);
    public List<Producto> readAll();
    public Optional<Producto> readOne(Long idProducto);
    public void update(Producto producto);
    public void delete (Long idProducto);

}
