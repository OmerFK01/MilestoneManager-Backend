package com.getCert.milestoneManager.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manager_tbl")
public class Manager implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String userId;
	private String firstName;
	private String LastName;
	private String username;
	private String password;
	private String email;
	

	private String profileImage;
	private Date lastLoginDate;
	private Date lastLoginDateDisplay;
	private Date joinDate;
	private String[] roles; // ROLE_USER{ read, edit}, ROLE_ADMIN{delete}
	private String[] authorise; // 
	private boolean isActive;
	private boolean isNotLocked;
	
	
	
	public Manager() {
		super();
	}

	public Manager(Long id, String userId, String firstName, String lastName, String password, String email,
				   String profileImage, Date lastLoginDate, Date lastLoginDateDisplay, Date joinDate, String[] roles,
				   String[] authorise, boolean isActive, boolean isNotLocked) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.LastName = lastName;
		this.password = password;
		this.email = email;
		this.profileImage = profileImage;
		this.lastLoginDate = lastLoginDate;
		this.lastLoginDateDisplay = lastLoginDateDisplay;
		this.joinDate = joinDate;
		this.roles = roles;
		this.authorise = authorise;
		this.isActive = isActive;
		this.isNotLocked = isNotLocked;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public Date getLastLoginDateDisplay() {
		return lastLoginDateDisplay;
	}
	public void setLastLoginDateDisplay(Date lastLoginDateDisplay) {
		this.lastLoginDateDisplay = lastLoginDateDisplay;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String[] getRoles() {
		return roles;
	}
	public void setRoles(String[] roles) {
		this.roles = roles;
	}
	public String[] getAuthorise() {
		return authorise;
	}
	public void setAuthorise(String[] authorise) {
		this.authorise = authorise;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isNotLocked() {
		return isNotLocked;
	}
	public void setNotLocked(boolean isNotLocked) {
		this.isNotLocked = isNotLocked;
	}

	@Override
	public String toString() {
		return "AccountManager [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", LastName=" + LastName
				+ ", password=" + password + ", email=" + email + ", profileImage=" + profileImage + ", lastLoginDate="
				+ lastLoginDate + ", lastLoginDateDisplay=" + lastLoginDateDisplay + ", joinDate=" + joinDate
				+ ", roles=" + Arrays.toString(roles) + ", authorization=" + Arrays.toString(authorise)
				+ ", isActive=" + isActive + ", isNotLocked=" + isNotLocked + "]";
	}

	
	
}
