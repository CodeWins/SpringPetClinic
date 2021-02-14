package iva.springframework.sfgpetclinic.services;

import iva.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created By iVa on 2/14/2021.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
