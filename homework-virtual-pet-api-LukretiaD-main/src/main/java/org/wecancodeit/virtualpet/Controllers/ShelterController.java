package org.wecancodeit.virtualpet.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.Models.Shelter;
import org.wecancodeit.virtualpet.Repositories.ShelterRepository;


@Controller
public class ShelterController {
    
private ShelterRepository shelterRepository;


    @RequestMapping({"","/","/shelters"})
    public String collectAllShelters(Model model) {
        model.addAttribute("shelters", shelterRepository.findAll());
        return "shelterView";
    }

    @GetMapping("/shelters/{id}")
    public String collectOneShelter(@PathVariable String name, Model model) {
        Shelter shelter = shelterRepository.findByName(name);
        model.addAttribute("shelter", shelter);
        return "shelterView";
    }


}
