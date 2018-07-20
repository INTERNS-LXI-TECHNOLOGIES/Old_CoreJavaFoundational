package com.lxisoft.culturalevaluation.user;
import com.lxisoft.culturalevaluation.user.*;
public class Usercontroler
{
	private Usermodel usermod;
	private Userview userview;
	public Usercontroler()
	{
		usermod.loaduserFile();
		usermod.userLogin();
		userview.loginPage();
		
	}
}