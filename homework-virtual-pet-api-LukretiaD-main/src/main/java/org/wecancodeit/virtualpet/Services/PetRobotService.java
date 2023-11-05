// package org.wecancodeit.virtualpet.Services;

// import org.springframework.stereotype.Service;
// import org.wecancodeit.virtualpet.Models.PetRobot;
// import org.wecancodeit.virtualpet.Repositories.PetRobotRepository;


// @Service
// public class PetRobotService {

//     private final PetRobotRepository petRobotRepository;

//     public PetRobotService(PetRobotRepository petRobotRepository) {
//         this.petRobotRepository = petRobotRepository;
//     }

//     public Iterable<PetRobot> collectAllPetRobots() {
//         return petRobotRepository.findAll();

//     }

//     public PetRobot collectOnePetRobot(Long id) throws Exception {
//         try {
//             return petRobotRepository.findById(id).get();
//         } catch (Exception e) {
//             throw new Exception("Robot not found");
//         }
//     }

// }
