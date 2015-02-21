package com.noAdd.controllar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noAdd.data.UserDetails;
import com.noAdd.repo.UserDetailsRepository;

@RestController
@RequestMapping("/user")
public class UserControllar {
	
	@Autowired UserDetailsRepository UserDetailsRepository;
	
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public String getUser() {
		List<UserDetails> users = UserDetailsRepository.findAll();
		//UserDetails user=users.get(0);
		return users.get(0).getFirstname() + " " + users.get(0).getLastname();
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String createUser(@PathVariable String name) {
		String result = "Hello Mr." + name;
		return result;
	}
}
