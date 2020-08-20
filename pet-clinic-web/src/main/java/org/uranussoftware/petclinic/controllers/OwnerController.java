package org.uranussoftware.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.uranussoftware.petclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    // Spring automatically wired the OwnerService
    // no need to explicitly @Autowire it hire
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners() {
        return "notimplemented";
    }
}
