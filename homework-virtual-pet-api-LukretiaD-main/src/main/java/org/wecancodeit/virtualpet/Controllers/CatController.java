package org.wecancodeit.virtualpet.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.Models.Cat;
// import org.wecancodeit.virtualpet.Models.Pet;
// import org.wecancodeit.virtualpet.Models.PetLive;
import org.wecancodeit.virtualpet.Repositories.CatRepository;
// import org.wecancodeit.virtualpet.Services.CatService;

import jakarta.annotation.Resource;

@Controller
public class CatController {


    @Resource
    private CatRepository catRepository;

    @RequestMapping("/cats")
    public String collectAllCats(Model model) {
        model.addAttribute("cats", catRepository.findAll());
        return "shelterView";
    }


    @GetMapping("/cats/{id}")

    public String collectOneCat(@PathVariable String name, Model model) {
        Cat cat = catRepository.findByName(name);
        model.addAttribute("cat", cat);
        return "shelterView";
    }


}
