package iva.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created By iVa on 2/14/2021.
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
