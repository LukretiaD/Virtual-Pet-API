package org.wecancodeit.virtualpet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.virtualpet.Models.Cat;
import org.wecancodeit.virtualpet.Models.Dog;
import org.wecancodeit.virtualpet.Models.PetRobot;
import org.wecancodeit.virtualpet.Models.Shelter;
import org.wecancodeit.virtualpet.Models.Volunteer;
import org.wecancodeit.virtualpet.Repositories.CatRepository;
import org.wecancodeit.virtualpet.Repositories.DogRepository;
import org.wecancodeit.virtualpet.Repositories.PetRobotRepository;
import org.wecancodeit.virtualpet.Repositories.ShelterRepository;
import org.wecancodeit.virtualpet.Repositories.VolunteerRepository;

import jakarta.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ShelterRepository sRepository;

    @Resource
    private VolunteerRepository vRepository;

    @Resource
    private CatRepository cRepository;

    @Resource
    private DogRepository dRepository;

    @Resource
    private PetRobotRepository rRepository;

    @Override
    public void run(String... args) throws Exception {

        Shelter shelter1 = new Shelter("Virtual Pet Shelter", "Dallas,Texas", 33343434567L, "Bob Walter");
        sRepository.save(shelter1);

        Shelter shelter2 = new Shelter("Care Shelter", "Orlando,Florida", 5832039786L, "Sharon Cruise");
        sRepository.save(shelter2);


        Volunteer volunteer1 = new Volunteer("Sarah James", "Virtual Pet Shelter", shelter1);
        vRepository.save(volunteer1);

        Volunteer volunteer2 = new Volunteer("Henry Marks", "Care Shelter", shelter2);
        vRepository.save(volunteer2);


        Cat cat1 = new Cat("fluffy", "Cat", 50, 50, 50, 50);
        cRepository.save(cat1);

        Cat cat2 = new Cat("Katz", "Cat", 50, 50, 50, 50);
        cRepository.save(cat2);


        Dog dog1 = new Dog("Ringo", "Dog", 50, 50, 50, 50);
        dRepository.save(dog1);

        Dog dog2 = new Dog("Bruce", "Dog", 50, 50, 50, 50);
        dRepository.save(dog2);
        

        PetRobot robot1 = new PetRobot("Bep-Bop", "Robot", 50, 50, 50, 50);
        rRepository.save(robot1);

        PetRobot robot2 = new PetRobot("Robo3000", "Robot", 50, 50, 50, 50);
        rRepository.save(robot2);

    }

}
