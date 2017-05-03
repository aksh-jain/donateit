package com.techmavericks.donateit.rest.service;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techmavericks.donateit.core.IAppManager;
import com.techmavericks.donateit.rest.request.DonationDetailsRequest;
import com.techmavericks.donateit.rest.request.UserDetailsRequest;
import com.techmavericks.donateit.rest.response.DonationResponse;
import com.techmavericks.donateit.rest.response.HomePageResponse;

/**
 * @author Akshay Jain
 *
 */

@RestController
@RequestMapping(value = "/donateit", produces = "application/json;charset=UTF-8")
public class AppServiceClass {

	public static final Logger log = LoggerFactory.getLogger(AppServiceClass.class);

	@Resource(name = "appManager")
	IAppManager appManager;
	
	@Resource(name = "objectMapper")
	ObjectMapper objectMapper;

	
	@RequestMapping(value = "/signup/{userType}", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> signUpGoogle(@PathVariable("userType") @NotNull String userType, @RequestBody UserDetailsRequest user)
			throws JsonProcessingException {
		
		HomePageResponse homePageResponse = appManager.signUpGoogle(userType, user);
		
		HttpStatus httpStatus = HttpStatus.OK;
		if(homePageResponse.getIsCreated() == true){
			httpStatus = HttpStatus.CREATED;
		}

		return new ResponseEntity<>(objectMapper.writeValueAsString(homePageResponse), httpStatus);
	}
	
	@RequestMapping(value = "/donate/item/{donorId}", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> donateItem(@PathVariable("donorId") @NotNull Long donorId, @RequestBody DonationDetailsRequest donationRequest)
			throws JsonProcessingException{
		
		DonationResponse donationResponse = appManager.donateItem(donationRequest, donorId);
		
		return new ResponseEntity<>(objectMapper.writeValueAsString(donationResponse), HttpStatus.OK);
		
	}

}