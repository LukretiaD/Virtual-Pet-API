package org.wecancodeit.virtualpet.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.Models.Shelter;
import org.wecancodeit.virtualpet.Models.Volunteer;
import org.wecancodeit.virtualpet.Repositories.VolunteerRepository;

import jakarta.annotation.Resource;

@Controller
public class VolunteerController {

    @Resource
    private VolunteerRepository volunteerRepository;

    @RequestMapping("/volunteers")
    public String collectAllVolunteers(Model model) {
        model.addAttribute("volunteers", volunteerRepository.findAll());
        return "shelterView";
    }

    @GetMapping("/volunteers/{id}")
    public String collectOneVolunteer(@PathVariable String name, Model model) {
        Volunteer volunteer = volunteerRepository.findByName(name);
        model.addAttribute("volunteer", volunteer);
        return "shelterView";
    }

    @PostMapping("")
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer) {
        return volunteerRepository.save(volunteer);

        
    }

}
