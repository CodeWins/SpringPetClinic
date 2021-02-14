package iva.springframework.sfgpetclinic.services;

import iva.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created By iVa on 2/14/2021.
 */
public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
