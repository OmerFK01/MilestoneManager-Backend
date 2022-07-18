package com.getCert.milestoneManager.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getCert.milestoneManager.model.Consultant;
import com.getCert.milestoneManager.exception.UserNotFoundException;
import com.getCert.milestoneManager.repo.EmployeeRepo;

@Service
public class EmployeeService {
	private final EmployeeRepo employeeRepo;

	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}
	
	public Consultant addEmployee(Consultant employee) {
		employee.setEmployeeType(UUID.randomUUID().toString());
		return employeeRepo.save(employee);
	}
	
	public List<Consultant> finaAllEmployees(){
		return employeeRepo.findAll();
	}
	
	public Consultant updateEmployee(Consultant employee) {
		return employeeRepo.save(employee);		
	}
	
	public void deleteEmployee(Long id) {
		employeeRepo.deleteEmployeeById((Long) id);
	}
	
	public Consultant findEmployeeById(Long id) {
		return employeeRepo.findEmployeeById(id)
				.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}
	
	
	
}
