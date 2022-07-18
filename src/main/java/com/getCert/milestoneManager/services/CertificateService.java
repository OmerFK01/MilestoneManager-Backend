package com.getCert.milestoneManager.services;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getCert.milestoneManager.exception.UserNotFoundException;
import com.getCert.milestoneManager.model.Certificate;
import com.getCert.milestoneManager.repo.CertificateRepo;

@Service
public class CertificateService {
	private final CertificateRepo certificateRepo;

	@Autowired
	public CertificateService(CertificateRepo certificateRepo) {
		super();
		this.certificateRepo = certificateRepo;
	}
	
	public Certificate addCertificate(Certificate certificate) {
		certificate.setUniqueCode(UUID.randomUUID().toString());
		return certificateRepo.save(certificate);
	}
	
	public List<Certificate> findAllCertificates(){
		return certificateRepo.findAll();
	}
	
	public Certificate updateCertificate(Certificate certificate) {
		return certificateRepo.save(certificate);
	}
	
	public void deleteById(Long id) {
		certificateRepo.deleteCertificateById(id);
		
	}
	
	public Certificate findCertificateById(Long id) {
		return certificateRepo.findCertificateById(id)
				.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}
	
	

}
