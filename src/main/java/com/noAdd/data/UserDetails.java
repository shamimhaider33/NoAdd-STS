package com.noAdd.data;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userDetails")
public class UserDetails {
	
	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
