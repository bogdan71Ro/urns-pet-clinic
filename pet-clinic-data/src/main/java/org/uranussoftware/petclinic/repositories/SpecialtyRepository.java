package org.uranussoftware.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.uranussoftware.petclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
