package iva.springframework.sfgpetclinic.services;

import iva.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created By iVa on 2/14/2021.
 */
public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}

