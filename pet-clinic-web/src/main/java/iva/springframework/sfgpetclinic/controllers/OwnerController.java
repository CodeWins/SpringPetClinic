package iva.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By iVa on 2/16/2021.
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"","/","/index","/index.html"})
    public String listVets(){
        return "owners/index";
    }
}
