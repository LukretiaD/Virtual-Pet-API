// package org.wecancodeit.virtualpet.Services;

// import org.springframework.stereotype.Service;
// import org.wecancodeit.virtualpet.Models.Volunteer;
// import org.wecancodeit.virtualpet.Repositories.VolunteerRepository;

// @Service
// public class VolunteerService {
    
// private final VolunteerRepository volunteerRepository;

// public VolunteerService(VolunteerRepository volunteerRepository) {
//     this.volunteerRepository = volunteerRepository;
// }

//     public Iterable<Volunteer> collectAllVolunteers() {
//         return volunteerRepository.findAll();
//     }

//     public Volunteer collectOneVolunteer(Long id) throws Exception {
//         try {
//             return volunteerRepository.findById(id).get();
//         } catch (Exception e) {
//             throw new Exception("Cat not found");
//         }
//     }

//     public Volunteer save(Volunteer volunteer) throws Exception {
//         return volunteerRepository.save(volunteer);
//     }

// }
