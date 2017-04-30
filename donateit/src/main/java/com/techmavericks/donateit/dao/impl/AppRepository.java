package com.techmavericks.donateit.dao.impl;

import com.techmavericks.donateit.dao.IAppRepository;
import com.techmavericks.donateit.dao.jpa.AbstractDao;

/***

@author Akshay Jain
 *
 */
 public class AppRepository extends AbstractDao implements IAppRepository {

 @Override
 public String getPassword(String userId) {

 return null;
 }

 }