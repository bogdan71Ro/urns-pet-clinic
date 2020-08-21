package org.uranussoftware.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.uranussoftware.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
