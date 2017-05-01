package com.techmavericks.donateit.core;

import com.techmavericks.donateit.rest.request.UserDetails;
import com.techmavericks.donateit.rest.response.HomePageResponse;

/**
 * @author Akshay Jain
 *
 */
public interface IAppManager {

	HomePageResponse signUpGoogle(String userType, UserDetails user);


}