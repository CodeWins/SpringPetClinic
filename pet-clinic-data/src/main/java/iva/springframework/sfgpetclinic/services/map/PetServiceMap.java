package iva.springframework.sfgpetclinic.services.map;

import iva.springframework.sfgpetclinic.model.Pet;
import iva.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created By iVa on 2/15/2021.
 */
@Service
public class PetServiceMap extends  AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
    super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void deleteBy(Long aLong) {
    super.deleteById(aLong);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
