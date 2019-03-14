package com.lxisoft.hotel.services;
import com.lxisoft.hotel.repo.*;
import java.util.regex.*;
/**
*<h1>Service Class For User</h1>
<p>
*This class is a Service class for User.
*All business logics are done throw this class
*@author Mohammed Anish
*@version 1.1
*/
public class UserService{
	UserRepo userRepo = new UserRepo();
	/**
	*this method is for checking registration user data mathces regex pattern
	*@param email email id of user
	*@param mabno mobile number of user
	*@param password password of user
	*@return true if matches pattern, false if didn't match
	*@throws Exception
	*/
	public boolean registerUser(String email,String mobno,String password) throws Exception{
		Pattern emailRegex = Pattern.compile("\\w+@\\w+\\.[a-z]{2,3}");
		Pattern mobNoRegex = Pattern.compile("(9|8|7)[0-9]{9,9}");
		Matcher emailCheck = emailRegex.matcher(email);
		Matcher mobnoCheck = mobNoRegex.matcher(mobno);
		int c = 0;
		while(emailCheck.find()){
				c = c+1;
		}
		while(mobnoCheck.find()){
				c = c+1;
		}
		if(c<2){
			return false;
		}
		else{
			userRepo.registerUser(email,mobno,password);
			return true;
		}
	}
	/**
	*this method is for senting email id to UserRepo class for checking it with data base
	*@param email email id for checking.
	*@return email id if fount in databasse else null
	*@throws Exception 
	*/
	public String login(String email) throws Exception{
		return userRepo.login(email);
	}
}