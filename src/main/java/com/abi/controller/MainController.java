package com.abi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="/home")
	public String homePage( Model model){
		model.addAttribute("name","rony");
		
		return "home";
	}
	@RequestMapping(value="/signup")
	public String registerPage( ){

		return "registration";
	}
}
