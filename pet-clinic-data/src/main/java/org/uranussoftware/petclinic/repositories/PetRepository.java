package org.uranussoftware.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.uranussoftware.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
