package com.lxisoft.quizz.user;
import com.lxisoft.quizz.quest.*;
import com.lxisoft.quize.clear.*;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;

public class UserController
{
	private UserModel usermodel;
	//private UserView userview;
	public UserController(UserModel usermodel)
	{
		this.usermodel=usermodel;
	
	}
	
