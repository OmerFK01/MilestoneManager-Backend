package  com.getCert.milestoneManager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/manager")
public class ManagerController{
	
	@GetMapping("/home ")
	public String showManager() {
		return "Application works";
	}
	
}
