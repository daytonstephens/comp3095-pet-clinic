package comp3095petclinic.bootstrap;

import model.Owner;
import model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.VetService;

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
        owner1.setFirstName("Baggins");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Samwise");
        owner2.setFirstName("Gangee");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Bilbo");
        vet1.setFirstName("Baggins");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Pippin");
        vet2.setFirstName("Took");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
