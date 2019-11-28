package com.gzrsia.blog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
	
	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/letisia")
	public String letisia() {
		return "welcome";
	}
	
}
