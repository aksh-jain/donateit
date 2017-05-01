/**
 * 
 */
package com.techmavericks.donateit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Ashish
 *
 */

@Entity
@Table(name = "DN_ORDER_DTL")
public class OrderDetailsEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_ID", unique = true, nullable = false, insertable = false, updatable = false)
	private Long orderId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DONOR_ID", referencedColumnName = "DONOR_ID", nullable = false, insertable = false, updatable = false)
	private DonorDetailsEntity donorDetails;
	
	@Column(name = "DONOR_ID", nullable = false)
	private Integer personCount;
	
	//TODO column overwrite
	@Embedded
	private AddressEntity address;

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
	public DonorDetailsEntity getDonorDetails() {
		return donorDetails;
	}

	/**
	 * @param donorDetails the donorDetails to set
	 */
	public void setDonorDetails(DonorDetailsEntity donorDetails) {
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
	public AddressEntity getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(AddressEntity address) {
		this.address = address;
	}
}
