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
	
	private String emailId;
	
	private Long mobileNo;
	
	private String gender;
	
//	@JsonDeserialize(using = LocalDateDeserializer.class)  
//	@JsonSerialize(using = LocalDateSerializer.class)  
//	private LocalDate dateOfBirth;
	
	private String photoUrl;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the mobileNo
	 */
	public Long getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

//	/**
//	 * @return the dateOfBirth
//	 */
//	public LocalDate getDateOfBirth() {
//		return dateOfBirth;
//	}
//
//	/**
//	 * @param dateOfBirth the dateOfBirth to set
//	 */
//	public void setDateOfBirth(LocalDate dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}

	/**
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/**
	 * @param photoUrl the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
}
