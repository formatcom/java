package com.lowlevel.model;

public class Contact {

	private String name;
	private String email;

	public Contact(String name, String email) {
		this.name  = name;
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		return String.format("%s[%s]", this.name, this.email);
	}
}
