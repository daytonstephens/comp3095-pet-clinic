package ca.gbc.comp3095.comp3095petclinic.services.map;

import ca.gbc.comp3095.comp3095petclinic.services.OwnerService;
import ca.gbc.comp3095.comp3095petclinic.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    public Owner findByLastName(String lastname) {
        return null;
    }

}
