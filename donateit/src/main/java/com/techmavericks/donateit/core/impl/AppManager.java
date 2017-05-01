package com.techmavericks.donateit.core.impl;

import javax.annotation.Resource;

import com.techmavericks.donateit.core.IAppManager;
import com.techmavericks.donateit.dao.IAppRepository;
import com.techmavericks.donateit.rest.request.UserDetails;
import com.techmavericks.donateit.rest.response.HomePageResponse;

/**
 * @author Akshay Jain
 *
 */
public class AppManager implements IAppManager {
	
	@Resource(name = "appRepository")
	IAppRepository appRepository;

	@Override
	public HomePageResponse signUpGoogle(String userType, UserDetails user) {
		
		if(userType.equalsIgnoreCase("gmail")){
		
			Long donorId = appRepository.checkUserGoogle(user.getEmailId());
			
			if(donorId == null){
				Long newDonorId =  appRepository.insertUserDetails(user , userType );
				HomePageResponse homePageResponse = appRepository.fetchUserDetails(newDonorId);
				homePageResponse.setIsCreated(true);
				return homePageResponse;
				
			}
			else {
				return appRepository.fetchUserDetails(donorId);
			}
		}
		
		else {
			
			Long donorId = appRepository.checkUserGuest(user.getMobileNo());
			
			if(donorId == null){
				Long newDonorId =  appRepository.insertUserDetails(user , userType);
				HomePageResponse homePageResponse = appRepository.fetchUserDetails(newDonorId);
				homePageResponse.setIsCreated(true);
				return homePageResponse;
			}
			else {
				return appRepository.fetchUserDetails(donorId);
			}
		}
	}
}