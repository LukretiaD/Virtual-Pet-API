package org.wecancodeit.virtualpet.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.Models.Dog;
import org.wecancodeit.virtualpet.Repositories.DogRepository;

@Controller
public class DogController {

    private DogRepository dogRepository;

    @RequestMapping("/dogs")
    public String collectAlldogs(Model model) {
        model.addAttribute("dogs", dogRepository.findAll());
        return "shelterView";
    }

    @GetMapping("/dogs/{id}")
    public String collectOnedog(@PathVariable String name, Model model) {
        Dog dog = dogRepository.findByName(name);
        model.addAttribute("dog", dog);
        return "shelterView";
    }

}
