package com.getCert.milestoneManager.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getCert.milestoneManager.model.RegistrationRequest;
import com.getCert.milestoneManager.services.RegistrationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path ="api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
	
	private RegistrationService registrationService;

	public String register(@RequestBody RegistrationRequest request) {
		return registrationService.register(request);
	}
}
