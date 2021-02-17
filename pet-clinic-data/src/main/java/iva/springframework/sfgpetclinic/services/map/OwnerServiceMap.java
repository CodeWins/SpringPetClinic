package iva.springframework.sfgpetclinic.services.map;

import iva.springframework.sfgpetclinic.model.Owner;
import iva.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created By iVa on 2/15/2021.
 */
@Service
public class OwnerServiceMap extends AbstractMapService <Owner, Long> implements OwnerService{
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


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
