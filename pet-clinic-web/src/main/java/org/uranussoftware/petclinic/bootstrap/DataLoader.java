package org.uranussoftware.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.uranussoftware.petclinic.model.Owner;
import org.uranussoftware.petclinic.model.Pet;
import org.uranussoftware.petclinic.model.PetType;
import org.uranussoftware.petclinic.model.Vet;
import org.uranussoftware.petclinic.services.OwnerService;
import org.uranussoftware.petclinic.services.PetTypeService;
import org.uranussoftware.petclinic.services.VetService;

import java.time.LocalDate;

/**
 *  Bootstrap class
 *  Loads initial data
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    // Spring 4.X required an @Autowired here to inject fields
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        System.out.println("PET TYPES: loaded.");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel Street");
        owner1.setCity("Miami");
        owner1.setTelephone("555-CUTUCUTU");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");

        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("97 Meow Avenue");
        owner2.setCity("Fort Lauderdale");
        owner2.setTelephone("555-MEOWMEOW");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Lulu");

        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("OWNERS: loaded.");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Bobby");
        vet2.setLastName("Tables");

        vetService.save(vet2);

        System.out.println("VETS: loaded.");
    }
}
