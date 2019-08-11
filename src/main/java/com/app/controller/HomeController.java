package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(name = "/init", method = RequestMethod.GET)
	public String initMethod(Model model) {
		
		System.out.println("Home method called");
		model.addAttribute("name", "Amit Srivastava");
		return "Home";
	}
}
