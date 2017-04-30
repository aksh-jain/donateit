/**
 * 
 */
package com.techmavericks.donateit.domain;

import java.io.Serializable;

/**
 * @author Akshay Jain
 *
 */
public class DonorDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long donorId;

	private String donorName;

	private Address donorAddress;

	/**
	 * @return the donorId
	 */
	public Long getDonorId() {
		return donorId;
	}

	/**
	 * @param donorId
	 *            the donorId to set
	 */
	public void setDonorId(Long donorId) {
		this.donorId = donorId;
	}

	/**
	 * @return the donorName
	 */
	public String getDonorName() {
		return donorName;
	}

	/**
	 * @param donorName
	 *            the donorName to set
	 */
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	/**
	 * @return the donorAddress
	 */
	public Address getDonorAddress() {
		return donorAddress;
	}

	/**
	 * @param donorAddress
	 *            the donorAddress to set
	 */
	public void setDonorAddress(Address donorAddress) {
		this.donorAddress = donorAddress;
	}

}
