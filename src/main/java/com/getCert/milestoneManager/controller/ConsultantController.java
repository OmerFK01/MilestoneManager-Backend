package com.getCert.milestoneManager.controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getCert.milestoneManager.model.Consultant;
import com.getCert.milestoneManager.services.ConsultantService;

@RestController
@RequestMapping("/consultant")
public class ConsultantController{
	private final ConsultantService consultantService;

	public ConsultantController(ConsultantService consultantService) {
		this.consultantService = consultantService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Consultant>> getAllConsultants() {
		List<Consultant> consultants = consultantService.finaAllConsultants();
		return new ResponseEntity<>(consultants, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Consultant> getAllConsultantById(@PathVariable("id") Long id) {
		Consultant consultant = consultantService.findConsultantById(id);
		return new ResponseEntity<>(consultant, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Consultant> addConsultant(@RequestBody Consultant consultant) {
		Consultant newConsultant = consultantService.addConsultant(consultant);
		return new ResponseEntity<>(newConsultant, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Consultant> updateConsultant(@RequestBody Consultant consultant) {
		Consultant updateConsultant = consultantService.updateConsultant(consultant);
		return new ResponseEntity<>(updateConsultant, HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteConsultant(@PathVariable("id") Long id) {
		consultantService.deleteConsultant(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
/*
	@RequestMapping("/error")
	public String handleError(HttpServletRequest request) {
	    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	    
	    if (status != null) {
	        Integer statusCode = Integer.valueOf(status.toString());
	    
	        if(statusCode == HttpStatus.NOT_FOUND.value()) {
	            return "error-404";
	        }
	        else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
	            return "error-500";
	        }
	    }
	    return "error";
	}
*/
}
