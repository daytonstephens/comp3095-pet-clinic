package services;

import model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastname);

    Owner findById(Long id);

    Owner save(Owner owner);

    // A set is a set of unique values
    Set<Owner> findAll();

}
