package com.getCert.milestoneManager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.getCert.milestoneManager.model.AppUser;
/*
@Repository
@Transactional(readOnly = true)
public interface AppUserRepo extends JpaRepository<AppUser, Long> {
	Optional<AppUser> findByEmail(String email);
}
*/