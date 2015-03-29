package com.noAdd.bo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author Shamim Ahmad
 *
 */
public class UserDetailsBO {
	
	private static final long serialVersionUID = 1L;

	private String fname;
	private String lname;
	

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
