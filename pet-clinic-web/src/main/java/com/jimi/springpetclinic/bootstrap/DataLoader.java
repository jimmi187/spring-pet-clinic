package com.jimi.springpetclinic.bootstrap;


import com.jimi.springpetclinic.model.Owner;
import com.jimi.springpetclinic.model.Pet;
import com.jimi.springpetclinic.model.PetType;
import com.jimi.springpetclinic.model.Vet;
import com.jimi.springpetclinic.services.OwnerService;
import com.jimi.springpetclinic.services.PetTypeService;
import com.jimi.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }



    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);


        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);
        System.out.println(savedCatType.getId());
        System.out.println(savedCatType.getName());


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 beartkly");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirtDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getpets().add(mikesPet);

        ownerService.save(owner1);



        Owner owner2 = new Owner();
        owner2.setFirstName("Fiaona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 beartkly");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        Pet fionasCat = new Pet();
        fionasCat.setName("Kockica");
        fionasCat.setOwner(owner2);
        fionasCat.setPetType(savedCatType);
        fionasCat.setBirtDate(LocalDate.now());
        owner1.getpets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");


        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets......");






    }
}
