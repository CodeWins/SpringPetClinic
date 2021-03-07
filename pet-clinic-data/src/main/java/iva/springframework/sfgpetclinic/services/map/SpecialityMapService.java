package iva.springframework.sfgpetclinic.services.map;

import iva.springframework.sfgpetclinic.model.Speciality;
import iva.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created By iVa on 3/6/2021.
 */
@Component
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteBy(Long aLong) {
            super.deleteById(aLong);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
