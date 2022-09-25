package com.getCert.milestoneManager.model;

import java.util.Collection;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.authority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class ManagerPrincipal implements UserDetails {

	private Manager mngr;

	public ManagerPrincipal(Manager aM) {
		this.mngr = aM;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return stream(this.mngr.getAuthorise()).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		//
		return this.mngr.getPassword();
	}

	@Override
	public String getUsername() {
		//
		return this.mngr.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		//
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		//
		return this.mngr.isNotLocked();
	}

	@Override
	public boolean isCredentialsNonExpired(){
		//
		return false;
	}

	@Override
	public boolean isEnabled() {
		//
		return this.mngr.isActive();
	}

}
