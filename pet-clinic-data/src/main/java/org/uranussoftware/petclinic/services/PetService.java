package org.uranussoftware.petclinic.services;

import org.uranussoftware.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Set<Pet> findAll();
    Pet findById(Long id);
    Pet save(Pet pet);
}
