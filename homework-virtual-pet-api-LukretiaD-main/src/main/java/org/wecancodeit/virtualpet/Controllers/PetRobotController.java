package org.wecancodeit.virtualpet.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.Models.PetRobot;
import org.wecancodeit.virtualpet.Repositories.PetRobotRepository;

@Controller
public class PetRobotController {

    private PetRobotRepository petRobotRepository;

    @RequestMapping("/robots")
    public String collectAllRobots(Model model) {
        model.addAttribute("robots", petRobotRepository.findAll());
        return "shelterView";
    }

    @GetMapping("/robots/{id}")
    public String collectOneRobot(@PathVariable String name, Model model) {
        PetRobot robot = petRobotRepository.findByName(name);
        model.addAttribute("robot", robot);
        return "shelterView";
    }

}
