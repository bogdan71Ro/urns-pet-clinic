package org.uranussoftware.petclinic.services;

import org.uranussoftware.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
