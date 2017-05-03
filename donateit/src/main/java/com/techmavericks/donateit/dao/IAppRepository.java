package com.techmavericks.donateit.dao;

import com.techmavericks.donateit.domain.DonationDetails;
import com.techmavericks.donateit.rest.request.UserDetailsRequest;
import com.techmavericks.donateit.rest.response.DonationResponse;
import com.techmavericks.donateit.rest.response.HomePageResponse;

/**
 * @author Akshay Jain
 *
 */
public interface IAppRepository {

	public Long checkUserGoogle(String emailId);
	
	public Long checkUserGuest(Long mobileNo);
	
	public Long insertUserDetails(UserDetailsRequest user, String userType);

	public HomePageResponse fetchUserDetails(Long donorId);

	public DonationResponse donateItem(DonationDetails donationDetails, Long donorId);

}