package iva.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 2/10/2021.
 * Created By Iva
 */
public class Vet extends Person {
    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
