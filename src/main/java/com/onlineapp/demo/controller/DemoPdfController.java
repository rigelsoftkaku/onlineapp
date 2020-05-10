package com.onlineapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoPdfController {

	@GetMapping("/pdf")
	public String createPdf() {
		return "Hello World";
	}
}
