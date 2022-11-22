package org.example.controllers;


import org.example.models.entities.Partner;
import org.example.models.services.PartnerServiceImpl;
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
@RequestMapping("/partner")
public class PartnerController {

    @Autowired
    private PartnerServiceImpl partnerService;

    @RequestMapping("/ver")
    public ModelAndView vistaPartner(){
        return new ModelAndView("partner");
    }

    @RequestMapping(value = ("/lista"), method = RequestMethod.GET)
    public ModelAndView mostrarPartner() {
        ModelAndView model = new ModelAndView();
        List<Partner> partners = partnerService.readAll();
        model.addObject("partners", partners);
        model.setViewName("formListarPartner");
        return model;
    }

    @RequestMapping(value = ("/agregar") , method = RequestMethod.GET)
    public ModelAndView agregarPartner(){
        ModelAndView model = new ModelAndView();
        Partner partner = new Partner();
        model.addObject("partnerForm", partner);
        model.setViewName("formCrearPartner");
        return model;
    }

    @RequestMapping(value = "/actualizar/{id}", method =  RequestMethod.GET)
    public ModelAndView actualizarPartner(@PathVariable Long id){
        ModelAndView model  = new ModelAndView();
        Optional<Partner> partner = partnerService.readOne(id);
        model.addObject("partnerForm", partner);
        model.setViewName("formCrearPartner");
        return model;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ModelAndView guardarEditarPartner(@ModelAttribute("partnerForm") Partner partner){
        if(partner.getIdPartner() != null){
            partnerService.update(partner);
        } else {
            partnerService.create(partner);
        }
        return new ModelAndView("redirect:/partner/lista");
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public ModelAndView eliminaPartner(@PathVariable("id") Long id){
        partnerService.delete(id);
        return new ModelAndView(("redirect:/partner/lista"));
    }

}
