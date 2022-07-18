package com.getCert.milestoneManager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getCert.milestoneManager.model.Consultant;

public interface EmployeeRepo extends JpaRepository<Consultant, Long>{

	void deleteEmployeeById(Long id);

	Optional<Consultant> findEmployeeById(Long id);

}
