/**
 * 
 */
package com.techmavericks.donateit.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Ashish
 *
 */
public class HomePageResponse {
	
	private String name;
	
	private String photoUrl;
	
	@JsonIgnore
	private boolean isCreated;

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
	 * @return the isCreated
	 */
	public boolean getIsCreated() {
		return isCreated;
	}

	/**
	 * @param isCreated the isCreated to set
	 */
	public void setIsCreated(boolean isCreated) {
		this.isCreated = isCreated;
	}


	/**
	 * @return the userType
	 */
}
