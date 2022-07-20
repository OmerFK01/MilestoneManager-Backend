package com.getCert.milestoneManager.model;

import java.util.Collection;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.authority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class UserPrincipal implements UserDetails {

	private AccountManager acctmngr;

	public UserPrincipal(AccountManager aM) {
		this.acctmngr = aM;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return stream(this.acctmngr.getAuthorise()).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		//
		return this.acctmngr.getPassword();
	}

	@Override
	public String getUsername() {
		//
		return this.acctmngr.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		//
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		//
		return this.acctmngr.isNotLocked();
	}

	@Override
	public boolean isCredentialsNonExpired(){
		//
		return false;
	}

	@Override
	public boolean isEnabled() {
		//
		return this.acctmngr.isActive();
	}

}
