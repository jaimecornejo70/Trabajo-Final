package org.example.controllers;


import org.example.models.entities.Usuario;
import org.example.models.services.UsuarioServiceImpl;
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
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioServiceImpl usuarioService;

    @RequestMapping(value = ("/lista"), method = RequestMethod.GET)
    public ModelAndView mostrarUsuarios() {
        ModelAndView model = new ModelAndView();
        List<Usuario> usuarios = usuarioService.readAll();
        model.addObject("usuarios", usuarios);
        model.setViewName("formListarUsuario");
        return model;
    }

    @RequestMapping(value = ("/agregar") , method = RequestMethod.GET)
    public ModelAndView agregarUsuario(){
        ModelAndView model = new ModelAndView();
        Usuario usuario = new Usuario();
        model.addObject("usuarioForm", usuario);
        model.setViewName("formCrearUsuario");
        return model;
    }

    @RequestMapping(value = "/actualizar/{id}", method =  RequestMethod.GET)
    public ModelAndView actualizarUsuario(@PathVariable Long id){
        ModelAndView model  = new ModelAndView();
        Optional<Usuario> usuario = usuarioService.readOne(id);
        model.addObject("usuarioForm", usuario);
        model.setViewName("formCrearUsuario");
        return model;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ModelAndView guardarEditarUsuario(@ModelAttribute("usuarioForm") Usuario usuario){
        if(usuario.getIdUsuario() != null){
            usuarioService.update(usuario);
        } else {
            usuarioService.create(usuario);
        }
        return new ModelAndView("redirect:/usuario/lista");
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public ModelAndView eliminaUsuario(@PathVariable("id") Long id){
        usuarioService.delete(id);
        return new ModelAndView(("redirect:/usuario/lista"));
    }


}
