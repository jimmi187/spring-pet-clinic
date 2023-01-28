package com.jimi.springpetclinic.model;

import java.util.Set;

public class Owner extends Person {
    private Set<Pet> pers;

    public Set<Pet> getPers() {
        return pers;
    }

    public void setPers(Set<Pet> pers) {
        this.pers = pers;
    }
}
