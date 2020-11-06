package ca.gbc.comp3095.comp3095petclinic.bootstrap;

import ca.gbc.comp3095.comp3095petclinic.model.Owner;
import ca.gbc.comp3095.comp3095petclinic.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ca.gbc.comp3095.comp3095petclinic.services.OwnerService;
import ca.gbc.comp3095.comp3095petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Frodo");
        owner1.setLastName("Baggins");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Samwise");
        owner2.setLastName("Gangee");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Bilbo");
        vet1.setLastName("Baggins");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Pippin");
        vet2.setLastName("Took");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
