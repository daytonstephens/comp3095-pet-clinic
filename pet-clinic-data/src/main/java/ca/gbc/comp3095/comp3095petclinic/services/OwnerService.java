package ca.gbc.comp3095.comp3095petclinic.services;

import ca.gbc.comp3095.comp3095petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastname);

}
