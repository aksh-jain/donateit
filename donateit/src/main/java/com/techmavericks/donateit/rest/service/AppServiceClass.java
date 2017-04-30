/**
 * 
 */
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

import com.techmavericks.donateit.rest.request.UserDetails;
import com.techmavericks.donateit.rest.response.HelloWorld;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Akshay Jain
 *
 */

@RestController
@RequestMapping(value = "/donateit", produces = "application/json;charset=UTF-8")
public class AppServiceClass {

	public static final Logger log = LoggerFactory.getLogger(AppServiceClass.class);

	@Resource(name = "objectMapper")
	ObjectMapper objectMapper;

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET, consumes = "application/json")
	public ResponseEntity<String> getMessage(@PathVariable("name") @NotNull String name)
			throws JsonProcessingException {

		HelloWorld hello = new HelloWorld();

		hello.setName(name);

		return new ResponseEntity<>(objectMapper.writeValueAsString(hello), HttpStatus.OK);

	}

	@RequestMapping(value = "/body/{name}", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> getjson(@PathVariable("name") @NotNull String name, @RequestBody UserDetails user)
			throws JsonProcessingException {

		HelloWorld hello = new HelloWorld();

		hello.setName(user.getName() + " " + user.getSurname());

		return new ResponseEntity<>(objectMapper.writeValueAsString(hello), HttpStatus.OK);

	}
}