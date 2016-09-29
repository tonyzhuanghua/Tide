package com.qumu.demo.service;
import com.qumu.demo.exception.BizException;
/**
* This is service interface to manager user 
* Only for demo use
* @author  Hua Zhuang
* @version 1.0
* @since   05-03-2016
*/
import com.qumu.demo.model.dto.UserDto;

public interface IAccountService {
	
 /**
   * This is the to retrieve user info
   * @param userName for the key to retrieve.
   * @return UserDto.
   * @exception BizException if no found.
   * @see BizException
   */	
	public UserDto getUser(String userName)throws BizException;	
	
	
 /**
   * This is the to addUser with userDto
   * apply tx 
   * @param user for dto to domain.
   * @return status String.
   */	
	public String addUser(UserDto user);
	public String updateUser(UserDto user);
	public String deleteUser(UserDto user);

}
