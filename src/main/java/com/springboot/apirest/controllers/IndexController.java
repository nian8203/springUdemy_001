package com.springboot.apirest.controllers;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping({"index","/","home"})
	public String index() {
		
		return "index";
	}

}
