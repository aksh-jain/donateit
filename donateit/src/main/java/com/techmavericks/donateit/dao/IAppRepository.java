package com.techmavericks.donateit.dao;

import com.techmavericks.donateit.rest.request.UserDetails;
import com.techmavericks.donateit.rest.response.HomePageResponse;

/**
 * @author Akshay Jain
 *
 */
public interface IAppRepository {

	public Long checkUserGoogle(String emailId);
	
	public Long checkUserGuest(Long mobileNo);
	
	public Long insertUserDetails(UserDetails user, String userType);

	public HomePageResponse fetchUserDetails(Long donorId);

}