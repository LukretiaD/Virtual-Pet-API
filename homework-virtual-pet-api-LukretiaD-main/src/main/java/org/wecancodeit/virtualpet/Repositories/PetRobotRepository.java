package org.wecancodeit.virtualpet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.Models.PetRobot;

public interface PetRobotRepository extends CrudRepository<PetRobot, Long> {
PetRobot findByName(String name);

}
