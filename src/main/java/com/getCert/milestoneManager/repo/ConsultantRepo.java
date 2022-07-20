package com.getCert.milestoneManager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getCert.milestoneManager.model.Consultant;

public interface ConsultantRepo extends JpaRepository<Consultant, Long>{

	void deleteConsultantById(Long id);

	Optional<Consultant> findConsultantById(Long id);

}
