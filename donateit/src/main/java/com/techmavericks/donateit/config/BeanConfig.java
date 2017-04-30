package com.techmavericks.donateit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techmavericks.donateit.core.IAppManager;
import com.techmavericks.donateit.core.impl.AppManager;
import com.techmavericks.donateit.dao.IAppRepository;
import com.techmavericks.donateit.dao.impl.AppRepository;

/***
 * 
 * @author Akshay Jain
 *
 */
@Configuration
public class BeanConfig {

	@Bean
	public IAppRepository appRepository() {
		return new AppRepository();
	}

	@Bean
	public IAppManager appManager() {
		return new AppManager();
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
