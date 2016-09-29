package com.qumu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.qumu.demo.dao.IUserDao;
import com.qumu.demo.exception.BizException;
import com.qumu.demo.model.dto.UserDto;

public class AccountServiceImpl implements IUserService {
	
	@Autowired
	IUserDao userDao;

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED) 
	public UserDto getUser(String userName) throws BizException {
		com.qumu.demo.model.domain.UserAccount userPojo= userDao.getUser(userName);
		UserDto userDto = new UserDto();
		userDto.setUserName(userPojo.getName());
		userDto.setUserBirthDate(userPojo.getDateOfBirth());
		return userDto;
	}	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,
		       isolation=Isolation.READ_COMMITTED, 
		       noRollbackFor={BizException.class},
	            readOnly=true, timeout=30)			
	public String addUser(UserDto user) {
		com.qumu.demo.model.domain.UserAccount userPojo = new com.qumu.demo.model.domain.UserAccount();
		userPojo.setName(user.getUserName());
		userPojo.setDateOfBirth(user.getUserBirthDate());
		return userDao.addUser(userPojo);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String updateUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String deleteUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}



}
