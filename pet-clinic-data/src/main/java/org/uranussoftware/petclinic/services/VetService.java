package org.uranussoftware.petclinic.services;

import org.uranussoftware.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Set<Vet> findAll();
    Vet findById(Long id);
    Vet save(Vet vet);
}
