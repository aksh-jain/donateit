/**
 * 
 */
package com.techmavericks.donateit.domain;

import java.io.Serializable;

/**
 * @author Akshay Jain
 *
 */
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	 private Long mobile;

	 private String addr1;

	 private String landMark;

	/**
	 * @return the mobile
	 */
	public Long getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the addr1
	 */
	public String getAddr1() {
		return addr1;
	}

	/**
	 * @param addr1 the addr1 to set
	 */
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	/**
	 * @return the landMark
	 */
	public String getLandMark() {
		return landMark;
	}

	/**
	 * @param landMark the landMark to set
	 */
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	 
	 
}
