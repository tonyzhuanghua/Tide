package com.qumu.demo.rest;

/**
* This is a rest resource that manager user
* Only for demo use
* @author  Hua Zhuang
* @version 1.0
* @since   05-03-2016
*/

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.qumu.demo.exception.BizException;
import com.qumu.demo.model.dto.UserDto;
import com.qumu.demo.service.IUserService;


@Path("demo")
public class AccountResource {
	
	@Autowired
	IUserService userService;
	
 /**
   * This is the to retrieve user info
   * @param userName for the key to retrieve.
   * @return Nothing.
   * @exception BizException if no found.
   * @see BizException
   */
	@GET
    @Path("user/{name}")
    @Produces("text/plain")
    public String getUser(@PathParam(value="userName")String userName) throws BizException{
        return ""; 
    }

	
 /**
   * This is the to add an user 
   * @param userName.
   * @param userBirthDate.
   * @return status String.
   */	
	@POST
    @Path("addUser")
    @Produces("text/plain")
	
    public String addUser(@PathParam(value="userName")String userName,@PathParam(value="userBirthDate")String userBirthDate) {
        UserDto userDto = new UserDto();
        userDto.setUserName(userName);
        userDto.setUserBirthDate(userBirthDate);
		return userService.addUser(userDto);
    }
}
