package com.techmavericks.donateit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/***
 * Entity to store address information.**

@author Akshay Jain
 *
 */

 @Embeddable
 public class AddressEntity implements Serializable {

 private static final long serialVersionUID = 1L;


 @Column(name = "MOBILE_NO")
 private Long mobile;

 @Column(name = "ADDR_LINE1")
 private String addr1;

 @Column(name = "ADDR_LANDMARK", length = 100)
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
