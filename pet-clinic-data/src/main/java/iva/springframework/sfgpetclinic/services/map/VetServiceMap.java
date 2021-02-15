package iva.springframework.sfgpetclinic.services.map;

import iva.springframework.sfgpetclinic.model.Vet;
import iva.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created By iVa on 2/15/2021.
 */
public class VetServiceMap extends  AbstractMapService<Vet,Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet vet) {
    super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void deleteBy(Long id) {
            super.deleteById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}