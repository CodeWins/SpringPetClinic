package iva.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created on 2/10/2021.
 * Created By Iva
 */
public class Owner extends  Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
