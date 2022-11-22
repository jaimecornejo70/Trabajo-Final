package org.example.controllers;

import org.example.models.entities.Contacto;
import org.example.models.services.ContactoServiceImpl;
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
@RequestMapping("/contacto")
public class ContactoController {

    @Autowired
    private ContactoServiceImpl contactoService;

    @RequestMapping("/ver")
    public ModelAndView vistaContacto(){
        return new ModelAndView("formContacto");
    }


    @RequestMapping(value = ("/lista"), method = RequestMethod.GET)
    public ModelAndView mostrarContacto() {
        ModelAndView model = new ModelAndView();
        List<Contacto> contactos = contactoService.readAll();
        model.addObject("contactos", contactos);
        model.setViewName("formListarContacto");
        return model;
    }

    @RequestMapping(value = ("/agregar") , method = RequestMethod.GET)
    public ModelAndView agregarContacto(){
        ModelAndView model = new ModelAndView();
        Contacto contacto = new Contacto();
        model.addObject("contactoForm", contacto);
        model.setViewName("formContacto");
        return model;
    }
    @RequestMapping(value = "/actualizar/{id}", method =  RequestMethod.GET)
    public ModelAndView actualizarContacto(@PathVariable Long id){
        ModelAndView model  = new ModelAndView();
        Optional<Contacto> contacto = contactoService.readOne(id);
        model.addObject("contactoForm", contacto);
        model.setViewName("formContacto");
        return model;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ModelAndView guardarEditarContacto(@ModelAttribute("contactoForm") Contacto contacto){
        if(contacto.getIdContacto() != null){
            contactoService.update(contacto);
        } else {
            contactoService.create(contacto);
        }
        return new ModelAndView("redirect:/contacto/lista");
    }

}
