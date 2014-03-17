package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping({"/", "/test"})
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(Model model) {
		model.addAttribute("message", "Welcome!");
		model.addAttribute("date", new Date());
		return "hello";
	}
}