package com.noAdd.controllar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noAdd.repo.UserDetailsRepository;
import com.noAdd.user.UserDetails;

@RestController
@RequestMapping("/user")
public class UserControllar {

	@Autowired	UserDetailsRepository UserDetailsRepository;
	private String dbConnectionCheck = "Please check your database connection!";

	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public String getUser() {
		
		try {
			List<UserDetails> users = UserDetailsRepository.findAll();
			return users.get(0).getFirstname();
		} catch (Exception e) {
			return dbConnectionCheck;
		}
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String createUser() {
		try {
			return null;
		} catch (Exception e) {
			return dbConnectionCheck;
		}
	}
}
