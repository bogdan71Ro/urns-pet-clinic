package org.uranussoftware.petclinic.services;

import org.uranussoftware.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Set<Owner> findAll();
    Owner findById(Long id);
    Owner findByLastName(String lastName);

    Owner save(Owner owner);
}
