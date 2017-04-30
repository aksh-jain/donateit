/**
 * 
 */
package com.techmavericks.donateit.rest.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Akshay Jain
 *
 */
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDetails {

	private String name;
	//private Long age;
	private String surname;
	private String email;
	private Long mobile;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Long getAge() {
//		return age;
//	}
//
//	public void setAge(Long age) {
//		this.age = age;
//	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	 public String getEmail() {
	 return email;
	 }
	
	 public void setEmail(String email) {
	 this.email = email;
	 }

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

}
