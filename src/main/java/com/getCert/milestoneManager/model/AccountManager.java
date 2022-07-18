package com.getCert.milestoneManager.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountManager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userId;
	private String firstName;
	private String LastName;
	private String password;
	private String email;
	private String profileImage;
	private Date lastLoginDate;
	private Date lastLoginDateDisplay;
	private Date joinDate;
	private String[] roles;
	private String[] authorization;
	private boolean isActive;
	private boolean isNotLocked;
	
}
