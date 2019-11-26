package org.uranussoftware.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.uranussoftware.petclinic.model.Owner;
import org.uranussoftware.petclinic.model.Vet;
import org.uranussoftware.petclinic.services.OwnerService;
import org.uranussoftware.petclinic.services.VetService;

/**
 *  Bootstrap class
 *  Loads initial data
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    // Spring 4.X required an @Autowired here to inject fields
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("OWNERS: loaded.");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Bobby");
        vet1.setLastName("Tables");

        vetService.save(vet2);

        System.out.println("VETS: loaded.");
    }
}
