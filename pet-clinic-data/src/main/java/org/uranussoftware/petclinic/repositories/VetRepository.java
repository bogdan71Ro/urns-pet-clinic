package org.uranussoftware.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.uranussoftware.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
