package iva.springframework.sfgpetclinic.services.map;

import iva.springframework.sfgpetclinic.model.Owner;
import iva.springframework.sfgpetclinic.model.Pet;
import iva.springframework.sfgpetclinic.services.OwnerService;
import iva.springframework.sfgpetclinic.services.PetService;
import iva.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created By iVa on 2/15/2021.
 */
@Service
public class OwnerServiceMap extends AbstractMapService <Owner, Long> implements OwnerService{

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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

        if(object!=null){
            if(object.getPets()!=null){
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        if(pet.getPetType()!=null){
                            pet.setPetType((petTypeService.save(pet.getPetType())));
                        }
                    }else{
                        throw  new RuntimeException("Pet Type is required");
                    }
                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else {
            return null;
        }

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
