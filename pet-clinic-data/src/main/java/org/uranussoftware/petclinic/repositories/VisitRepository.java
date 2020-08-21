package org.uranussoftware.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.uranussoftware.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
