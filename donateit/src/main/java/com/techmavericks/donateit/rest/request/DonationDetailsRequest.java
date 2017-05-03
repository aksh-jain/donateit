/**
 * 
 */
package com.techmavericks.donateit.rest.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.techmavericks.donateit.domain.Address;

/**
 * @author Akshay Jain
 *
 */

@XmlRootElement
public class DonationDetailsRequest {
	
	private Integer personCount;
	
	private Address address;

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
