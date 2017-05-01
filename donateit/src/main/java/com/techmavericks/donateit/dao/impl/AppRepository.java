package com.techmavericks.donateit.dao.impl;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.techmavericks.donateit.dao.IAppRepository;
import com.techmavericks.donateit.dao.jpa.AbstractDao;
import com.techmavericks.donateit.entity.DonorDetailsEntity;
import com.techmavericks.donateit.rest.request.UserDetails;
import com.techmavericks.donateit.rest.response.HomePageResponse;
import com.techmavericks.donateit.rest.service.AppServiceClass;

/***

@author Akshay Jain
 *
 */
 public class AppRepository extends AbstractDao implements IAppRepository {
	 
	 public static final Logger log = LoggerFactory.getLogger(AppServiceClass.class);
	 
	 Mapper mapper = new DozerBeanMapper();

	@Override
	public Long checkUserGoogle(String emailId) {

		try{
			TypedQuery<Long> query = getEm().createNamedQuery("donorDetails.checkGoogleUser", Long.class);
			query.setParameter("emailId", emailId);
			Long donorId = query.getSingleResult();
			if (donorId != null){
				return donorId;
			}
			else {
				return null;
			}
		}
		
		catch(NoResultException ex){
			return null;
		}
	}

	@Override
	public Long checkUserGuest(Long mobileNo) {
		
		try{
			TypedQuery<Long> query = getEm().createNamedQuery("donorDetails.checkGuestUser", Long.class);
			query.setParameter("mobileNo", mobileNo);
			Long donorId = query.getSingleResult();
			if (donorId != null){
				return donorId;
			}
			else {
				return null;
			}
		}
		
		catch(NoResultException ex){
			return null;
		}
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Long insertUserDetails(UserDetails user , String userType) {
		
		DonorDetailsEntity donorDetailsEntity = mapper.map(user, DonorDetailsEntity.class);
		donorDetailsEntity.setLoginType(userType);
		
		getEm().persist(donorDetailsEntity);
		getEm().flush();
		
		if(donorDetailsEntity.getLoginType().equalsIgnoreCase("gmail")) {
			return checkUserGoogle(donorDetailsEntity.getEmailId());
		}
		
		else{
			return checkUserGuest(donorDetailsEntity.getMobileNo());
		}
	}

	@Override
	public HomePageResponse fetchUserDetails(Long donorId) {

		try{
			TypedQuery<DonorDetailsEntity> query = getEm().createNamedQuery("donorDetails.fetchUserDetails", DonorDetailsEntity.class);
			query.setParameter("donorId", donorId);
			DonorDetailsEntity donorDetailsEntity = query.getSingleResult();
			
			return mapper.map(donorDetailsEntity, HomePageResponse.class);
		}
		
		catch(NoResultException ex){
			return null;
		}
	
	}

 }