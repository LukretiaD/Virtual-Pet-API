// package org.wecancodeit.virtualpet.Services;

// import org.springframework.stereotype.Service;
// import org.wecancodeit.virtualpet.Models.Shelter;
// import org.wecancodeit.virtualpet.Repositories.ShelterRepository;

// @Service
// public class ShelterService {
    
// private final ShelterRepository shelterRepository;

// public ShelterService(ShelterRepository shelterRepository) {
//     this.shelterRepository = shelterRepository;
// }

//     public Iterable<Shelter> collectAllShelters() {
//         return shelterRepository.findAll();
//     }

//     public Shelter collectOneShelter(Long id) throws Exception {
//         try {
//             return shelterRepository.findById(id).get();
//         } catch (Exception e) {
//             throw new Exception("That Shelter doesn't exist");
//         }
//     }


// }
