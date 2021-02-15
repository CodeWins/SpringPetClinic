package iva.springframework.sfgpetclinic.services.map;

import iva.springframework.sfgpetclinic.model.Owner;
import iva.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created By iVa on 2/15/2021.
 */
public class OwnerServiceMap extends AbstractMapService <Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deleteBy(Long aLong) {
        super.deleteById(aLong);

    }


}
