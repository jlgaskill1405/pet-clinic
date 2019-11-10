package com.gtech.petclinicdata.services;

import com.gtech.petclinicdata.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
