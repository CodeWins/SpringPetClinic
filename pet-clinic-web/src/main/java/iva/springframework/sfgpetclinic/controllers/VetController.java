package iva.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By iVa on 2/16/2021.
 */

@Controller
public class VetController {
    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
