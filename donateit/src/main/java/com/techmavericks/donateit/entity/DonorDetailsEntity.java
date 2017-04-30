package com.techmavericks.donateit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * Entity Containing donor details**
 * 
 * @author Akshay Jain
 **/

@Entity
@Table(name = "DN_DONOR_DTL")
public class DonorDetailsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DONOR_ID", unique = true, nullable = false, insertable = false, updatable = false)
	private Long donorId;

	@Column(name = "DONOR_NAME", nullable = false, length = 50)
	private String donorName;

	@Embedded
	private AddressEntity donorAddress;

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
	public AddressEntity getDonorAddress() {
		return donorAddress;
	}

	/**
	 * @param donorAddress
	 *            the donorAddress to set
	 */
	public void setDonorAddress(AddressEntity donorAddress) {
		this.donorAddress = donorAddress;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((donorId == null) ? 0 : donorId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonorDetailsEntity other = (DonorDetailsEntity) obj;
		if (donorId == null) {
			if (other.donorId != null)
				return false;
		} else if (!donorId.equals(other.donorId))
			return false;
		return true;
	}

}
