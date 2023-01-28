package com.jimi.springpetclinic.model;

import java.util.Set;

public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pers;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPers() {
        return pers;
    }

    public void setPers(Set<Pet> pers) {
        this.pers = pers;
    }
}
