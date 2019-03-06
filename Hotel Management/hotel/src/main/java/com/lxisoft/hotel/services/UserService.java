package com.lxisoft.hotel.services;
import com.lxisoft.hotel.repo.*;
import java.util.regex.*;
public class UserService{
	UserRepo userRepo = new UserRepo();
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
	public String login(String email) throws Exception{
		return userRepo.login(email);
	}
}