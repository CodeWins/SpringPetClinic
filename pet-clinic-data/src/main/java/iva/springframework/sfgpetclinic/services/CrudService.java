package iva.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created By iVa on 2/15/2021.
 */
public interface CrudService <T, ID> {

    Set<T> findAll();

    T findById(ID id);

   T save(T object);

   void delete(T object);

   void deleteBy(ID id);

}
