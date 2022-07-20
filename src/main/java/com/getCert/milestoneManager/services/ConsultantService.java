package com.getCert.milestoneManager.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getCert.milestoneManager.model.Consultant;
import com.getCert.milestoneManager.exception.UserNotFoundException;
import com.getCert.milestoneManager.repo.ConsultantRepo;

@Service
public class ConsultantService {
	private final ConsultantRepo consultantRepo;

	@Autowired
	public ConsultantService(ConsultantRepo consultantRepo) {
		super();
		this.consultantRepo = consultantRepo;
	}
	
	public Consultant addConsultant(Consultant consultant) {
		consultant.setConsultantType(UUID.randomUUID().toString());
		return consultantRepo.save(consultant);
	}
	
	public List<Consultant> finaAllConsultants(){
		return consultantRepo.findAll();
	}
	
	public Consultant updateConsultant(Consultant consultant) {
		return consultantRepo.save(consultant);		
	}
	
	public void deleteConsultant(Long id) {
		consultantRepo.deleteById((Long) id);
	}
	
	public Consultant findConsultantById(Long id) {
		return consultantRepo.findConsultantById(id)
				.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}
	
	
	
}
