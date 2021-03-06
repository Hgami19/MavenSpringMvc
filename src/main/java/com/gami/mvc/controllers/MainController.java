package com.gami.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gami.mvc.services.GreetingService;

@Controller
@RequestMapping("/main")
public class MainController {

	@Autowired
	public GreetingService greetingService;
	
	
	@ResponseBody
	@RequestMapping("/")
	public String message(Model model) {
		model.addAttribute("message",this.greetingService.greet());
		return "hello.jsp";
	
	}

}
