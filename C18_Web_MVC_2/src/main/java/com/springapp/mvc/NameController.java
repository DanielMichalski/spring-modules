package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: Daniel
 */
@Controller
public class NameController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String name(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "name";
    }
}
