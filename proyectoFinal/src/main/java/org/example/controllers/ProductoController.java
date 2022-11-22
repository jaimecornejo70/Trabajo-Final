package org.example.controllers;


import org.example.models.entities.Producto;
import org.example.models.services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductoController {

    @Autowired
    private ProductoServiceImpl productoService;

    @RequestMapping("/ver")
    public ModelAndView vistaProducto(){
        return new ModelAndView("product");
    }

    @RequestMapping(value = ("/lista"), method = RequestMethod.GET)
    public ModelAndView mostrarProductos() {
        ModelAndView model = new ModelAndView();
        List<Producto> productos = productoService.readAll();
        model.addObject("productos", productos);
        model.setViewName("formListarProducto");
        return model;
    }

    @RequestMapping(value = ("/agregar") , method = RequestMethod.GET)
    public ModelAndView agregarProducto(){
        ModelAndView model = new ModelAndView();
        Producto producto = new Producto();
        model.addObject("productoForm", producto);
        model.setViewName("formCrearProducto");
        return model;
    }

    @RequestMapping(value = "/actualizar/{id}", method =  RequestMethod.GET)
    public ModelAndView actualizarProducto(@PathVariable Long id){
        ModelAndView model  = new ModelAndView();
        Optional<Producto> producto = productoService.readOne(id);
        model.addObject("productoForm", producto);
        model.setViewName("formCrearProducto");
        return model;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ModelAndView guardarEditarProducto(@ModelAttribute("productoForm") Producto producto){
        if(producto.getIdProducto() != null){
            productoService.update(producto);
        } else {
            productoService.create(producto);
        }
        return new ModelAndView("redirect:/product/lista");
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public ModelAndView eliminaProducto(@PathVariable("id") Long id){
        productoService.delete(id);
        return new ModelAndView(("redirect:/product/lista"));
    }

}
