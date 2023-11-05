package org.wecancodeit.virtualpet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.Models.Volunteer;

public interface VolunteerRepository extends CrudRepository<Volunteer, Long> {
    Volunteer findByName(String name);
}
