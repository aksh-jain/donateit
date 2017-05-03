package com.techmavericks.donateit.core.impl;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.annotation.Resource;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.techmavericks.donateit.core.IAppManager;
import com.techmavericks.donateit.dao.IAppRepository;
import com.techmavericks.donateit.domain.DonationDetails;
import com.techmavericks.donateit.domain.DonorDetails;
import com.techmavericks.donateit.rest.request.DonationDetailsRequest;
import com.techmavericks.donateit.rest.request.UserDetailsRequest;
import com.techmavericks.donateit.rest.response.DonationResponse;
import com.techmavericks.donateit.rest.response.HomePageResponse;

/**
 * @author Akshay Jain
 *
 */
public class AppManager implements IAppManager {
	
	@Resource(name = "appRepository")
	IAppRepository appRepository;
	
	Mapper mapper = new DozerBeanMapper();

	@Override
	public HomePageResponse signUpGoogle(String userType, UserDetailsRequest user) {
		
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

	@Override
	public DonationResponse donateItem(DonationDetailsRequest donationRequest, Long donorId) {
		
		DonorDetails donorDetails = new DonorDetails();
		donorDetails.setDonorId(donorId);
		
		DonationDetails donationDetails = mapper.map(donationRequest, DonationDetails.class);
		//donationDetails.setDonationTimeStamp(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
		donationDetails.setDonorDetails(donorDetails);
				
		return appRepository.donateItem(donationDetails, donorId);
	}
}