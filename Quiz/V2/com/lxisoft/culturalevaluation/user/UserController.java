package com.lxisoft.culturalevaluation.user;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserController
{
	UserModel currentUser;
	ArrayList<UserModel> users;
	UserView view=new UserView();
	public ArrayList<UserModel> loadUserFile()
	{
		users=new ArrayList<UserModel>();
		try
		{
			File userFile=new File("./com/lxisoft/culturalevaluation/database/userFile.txt");
			BufferedReader reader=new BufferedReader(new FileReader(userFile));
			String line;
			int i=0;
			while((line=reader.readLine())!=null)
			{
				String[] userCredentials=line.split(";");
				String username=userCredentials[0];
				String password=userCredentials[1];
				UserModel user=new UserModel();
				user.setUsername(username);
				user.setPassword(password);
				users.add(user);
			}
		}
		catch(IOException e)
		{
			UserView view=new UserView();
			view.printError("File not found...");
		}
		return users;
	}
	public UserModel getCurrentUser()
	{
		currentUser=new UserModel();
		do
		{
			String userName=view.askUsername();
			if(isExistingUser(userName))
			{
				currentUser.setUsername(userName);
				String password=view.askPassword();
				currentUser.setPassword(password);
			}
			else
			{
				view.printError("Invalid username...");
				continue;
			}
		}while(!validateUser());
		view.loginSuccess(currentUser.getUsername());
		return currentUser;
	}
	public boolean isExistingUser(String userName)
	{
		for(UserModel u:users)
		{
			if(userName.equals(u.getUsername()))
				return true;
		}
		return false;
	}
	public boolean validateUser()
	{
		for(UserModel user:users)
		{
			if(user.getUsername().equals(currentUser.getUsername()))
			{
				if(user.getPassword().equals(currentUser.getPassword()))
				{
					return true;
				}
				else
				{
					view.printError("Password Incorrect...");
					break;
				}
			}
		}
		return false;
	}
}