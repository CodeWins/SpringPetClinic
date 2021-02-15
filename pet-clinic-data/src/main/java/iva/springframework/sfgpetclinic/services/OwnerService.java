package iva.springframework.sfgpetclinic.services;

import iva.springframework.sfgpetclinic.model.Owner;

/**
 * Created By iVa on 2/14/2021.
 */
public interface OwnerService  extends  CrudService <Owner, Long>{

    Owner findByLastName(String lastName);

}
