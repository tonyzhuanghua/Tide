package com.qumu.demo.dao;
/**
* This is dao interface to manager user 
* Only for demo use
* @author  Hua Zhuang
* @version 1.0
* @since   05-03-2016
*/

public interface IAccountDao {
	
	public com.qumu.demo.model.domain.UserAccount getUser(String userName);
	public String addUser(com.qumu.demo.model.domain.UserAccount user);
	public String updateUser(com.qumu.demo.model.domain.UserAccount user);
	public String deleteUser(com.qumu.demo.model.domain.UserAccount user);

}
