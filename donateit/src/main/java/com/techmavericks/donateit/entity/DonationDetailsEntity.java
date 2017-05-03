/**
 * 
 */
package com.techmavericks.donateit.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
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
@Table(name = "DN_DONATION_DTL")
public class DonationDetailsEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DONATION_ID", unique = true, nullable = false, insertable = false, updatable = false)
	private Long donationId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DONOR_ID", referencedColumnName = "DONOR_ID", nullable = false, updatable = false)
	private DonorDetailsEntity donorDetails;
	
	@Column(name = "PERSON_COUNT", nullable = false)
	private Integer personCount;
	
	@Column(name = "DONATION_TIME_STAMP", nullable = true)
	private LocalDateTime donationTimeStamp;
	
	@AttributeOverrides({@AttributeOverride(name = "mobile", column =  @Column(name = "DONOR_MOBILE_NO")), @AttributeOverride(name = "addr1", column =  @Column(name = "DONOR_ADDR")), @AttributeOverride(name = "landMark", column =  @Column(name = "DONOR_ADDR_LANDMARK")), @AttributeOverride(name = "city", column =  @Column(name = "DONOR_CITY")), @AttributeOverride(name = "state", column =  @Column(name = "DONOR_STATE"))})
	@Embedded
	private AddressEntity address;

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
