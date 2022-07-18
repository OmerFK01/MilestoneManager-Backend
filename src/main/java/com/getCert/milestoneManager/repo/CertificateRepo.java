package com.getCert.milestoneManager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getCert.milestoneManager.model.Certificate;


public interface CertificateRepo extends JpaRepository<Certificate, Long>{

	void deleteCertificateById(Long id);

	Optional<Certificate> findCertificateById(Long id);

}
