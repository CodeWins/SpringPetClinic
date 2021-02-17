package iva.springframework.sfgpetclinic.controllers;

import iva.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By iVa on 2/16/2021.
 */

@Controller
public class VetController {
    public final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(Model model){

            model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }


}
