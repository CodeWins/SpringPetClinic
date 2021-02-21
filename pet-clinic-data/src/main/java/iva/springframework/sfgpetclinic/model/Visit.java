package iva.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created By iVa on 2/20/2021.
 */
public class Visit extends BaseEntity{

    private LocalDate date;
    private String desciption;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
