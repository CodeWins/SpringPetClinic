package iva.springframework.sfgpetclinic.model;

/**
 * Created By iVa on 2/20/2021.
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
