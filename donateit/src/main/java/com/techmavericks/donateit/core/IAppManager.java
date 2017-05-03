package com.techmavericks.donateit.core;

import com.techmavericks.donateit.rest.request.DonationDetailsRequest;
import com.techmavericks.donateit.rest.request.UserDetailsRequest;
import com.techmavericks.donateit.rest.response.DonationResponse;
import com.techmavericks.donateit.rest.response.HomePageResponse;

/**
 * @author Akshay Jain
 *
 */
public interface IAppManager {

	HomePageResponse signUpGoogle(String userType, UserDetailsRequest user);

	DonationResponse donateItem(DonationDetailsRequest donationRequest, Long donorId);


}