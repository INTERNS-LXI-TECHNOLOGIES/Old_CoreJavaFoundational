package com.lxisoft.culturalevaluation.assessment;
import com.lxisoft.culturalevaluation.user.UserModel;
import java.util.ArrayList;

public class AssessmentModel
{
	private ArrayList<UserModel> userList;
	private UserModel currentUser;
	
	public ArrayList<UserModel> getUserList()
	{
		return userList;
	}
	public void setUserList(ArrayList<UserModel> userList)
	{
		this.userList=userList;
	}
	public UserModel getCurrentUser()
	{
		return currentUser;
	}
	public void setCurrentUser(UserModel currentUser)
	{
		this.currentUser=currentUser;
	}
}