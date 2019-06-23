package com.app.samples.mvc.ms3icontactmanagementapi.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String index(Map<String,Object> model) {
		model.put("message", "welcome to spring boot mvc");
		return "index";
	}
	
	@RequestMapping("/next")
	public String home(Map<String,Object> map) {
		map.put("message", "you are on home page");
		return "next";
	}
	
	@PostMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";		
	}
}
