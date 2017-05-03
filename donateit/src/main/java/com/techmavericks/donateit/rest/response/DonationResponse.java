/**
 * 
 */
package com.techmavericks.donateit.rest.response;

import java.time.LocalDateTime;

import com.techmavericks.donateit.domain.Address;

/**
 * @author Akshay Jain
 *
 */
public class DonationResponse {
	
	private Long donationId;
	
	private Integer personCount;
	
	private LocalDateTime donationTimeStamp;
	
	private Address address;

	/**
	 * @return the donationId
	 */
	public Long getDonationId() {
		return donationId;
	}

	/**
	 * @param donationId the donationId to set
	 */
	public void setDonationId(Long donationId) {
		this.donationId = donationId;
	}

	/**
	 * @return the personCount
	 */
	public Integer getPersonCount() {
		return personCount;
	}

	/**
	 * @param personCount the personCount to set
	 */
	public void setPersonCount(Integer personCount) {
		this.personCount = personCount;
	}

	/**
	 * @return the donationTimeStamp
	 */
	public LocalDateTime getDonationTimeStamp() {
		return donationTimeStamp;
	}

	/**
	 * @param donationTimeStamp the donationTimeStamp to set
	 */
	public void setDonationTimeStamp(LocalDateTime donationTimeStamp) {
		this.donationTimeStamp = donationTimeStamp;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
}
