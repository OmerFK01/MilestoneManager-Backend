package com.getCert.milestoneManager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class AcctMngrController {

	@GetMapping("/user")
	public String showAMngr() {
		return "Application works";
	}
}
