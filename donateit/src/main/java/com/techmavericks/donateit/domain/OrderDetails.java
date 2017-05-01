/**
 * 
 */
package com.techmavericks.donateit.domain;

import java.io.Serializable;

/**
 * @author Ashish
 *
 */
public class OrderDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long orderId;
	
	private DonorDetails donorDetails;
	
	private Integer personCount;

	private Address address;

	/**
	 * @return the orderId
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the donorDetails
	 */
	public DonorDetails getDonorDetails() {
		return donorDetails;
	}

	/**
	 * @param donorDetails the donorDetails to set
	 */
	public void setDonorDetails(DonorDetails donorDetails) {
		this.donorDetails = donorDetails;
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
