package org.wecancodeit.virtualpet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Long> {
    Dog findByName(String name);

}
