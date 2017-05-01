package com.techmavericks.donateit.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/***
 * Entity Containing donor details**
 * 
 * @author Akshay Jain
 **/
@NamedQueries({@NamedQuery( name="donorDetails.checkGoogleUser", query="SELECT dd.donorId FROM donorDetails dd WHERE dd.emailId = :emailId"), 
		@NamedQuery(name = "donorDetails.checkGuestUser", query = "SELECT dd.donorId FROM donorDetails dd WHERE dd.mobileNo = :mobileNo"),
		@NamedQuery(name = "donorDetails.fetchUserDetails", query = "SELECT dd FROM donorDetails dd WHERE dd.donorId = :donorId")})
@Entity(name = "donorDetails")
@Table(name = "DN_DONOR_DTL")
public class DonorDetailsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DONOR_ID", unique = true, nullable = false, insertable = false, updatable = false)
	private Long donorId;

	@Column(name = "DONOR_NAME", nullable = false, length = 50)
	private String name;
	
	@Column(name = "DONOR_EMAIL", unique = true, length = 50)
	private String emailId;
	
	@Column(name = "DONOR_MOBILE_NO", unique = true, length = 50)
	private Long mobileNo;
	
	@Column(name = "Gender", length = 1)
	private String gender;
	
	@Column(name = "DONOR_DOB")
	private LocalDate dateOfBirth;
	
	@Column(name = "DONOR_PHOTO_URL")
	private String photoUrl;
	
	@Column(name = "DONOR_TYPE")
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
