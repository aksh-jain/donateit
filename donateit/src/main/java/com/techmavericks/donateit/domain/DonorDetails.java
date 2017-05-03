/**
 * 
 */
package com.techmavericks.donateit.domain;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Akshay Jain
 *
 */
public class DonorDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long donorId;

	private String name;
	
	private String email;
	
	private Long mobileNo;
	
	private String gender;
	
	private LocalDate dateOfBirth;
	
	private String photoUrl;
	
	private String loginType;

	/**
	 * @return the donorId
	 */
	public Long getDonorId() {
		return donorId;
	}

	/**
	 * @param donorId the donorId to set
	 */
	public void setDonorId(Long donorId) {
		this.donorId = donorId;
	}

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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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

	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

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

	/**
	 * @return the loginType
	 */
	public String getLoginType() {
		return loginType;
	}

	/**
	 * @param loginType the loginType to set
	 */
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

}
