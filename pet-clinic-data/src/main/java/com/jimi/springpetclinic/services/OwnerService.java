package com.jimi.springpetclinic.services;

import com.jimi.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}





