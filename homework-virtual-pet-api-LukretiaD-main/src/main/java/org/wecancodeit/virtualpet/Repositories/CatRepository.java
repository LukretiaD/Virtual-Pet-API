package org.wecancodeit.virtualpet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.Models.Cat;


public interface CatRepository extends CrudRepository<Cat,Long> {
   Cat findByName(String name);
}
