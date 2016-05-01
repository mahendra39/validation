package com.example.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

import com.example.annotation.UniqueUserName;

public class Account {
	// @NotNull
	// @NotEmpty
	@Length(min = 3, max = 10)

	@UniqueUserName(message = " user name already exit")
	private String username;

	@NotEmpty
	@Length(min = 3, max = 10)
	private String password;
	@NotNull
	@Min(18)
	@Max(60)
	private int age;
	@NotEmpty
	@Email
	private String email;
	@URL
	private String website;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("usrname=" + username);
		sb.append(",password=" + password);
		sb.append(",age=" + age);
		sb.append(",email=" + email);
		sb.append(",website=" + website);

		return sb.toString();
	}

	}


