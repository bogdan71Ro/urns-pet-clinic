package org.uranussoftware.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping({"/whoops", "/oups"})
    public String whoopsHandler() {
        return "notimplemented";
    }
}
