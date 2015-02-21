package com.noAdd.controllar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllar {
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getUser(@PathVariable String name) {
		String result = "Hello Mr." + name;
		return result;
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.POST)
	public String createUser(@PathVariable String name) {
		String result = "Hello Mr." + name;
		return result;
	}
}
