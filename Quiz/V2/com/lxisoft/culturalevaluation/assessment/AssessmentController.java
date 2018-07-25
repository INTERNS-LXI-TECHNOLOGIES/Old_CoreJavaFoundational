package com.lxisoft.culturalevaluation.assessment;
import com.lxisoft.culturalevaluation.user.UserController;
import java.util.ArrayList;
import com.lxisoft.culturalevaluation.user.UserModel;

public class AssessmentController
{
	private AssessmentModel model;
	
	public AssessmentController()
	{
		model=new AssessmentModel();
	}
	public void setModelUserList(ArrayList<UserModel> userList)
	{
		model.setUserList(userList);
	}
	public void setCurrentUserModel(UserModel currentUser)
	{
		model.setCurrentUser(currentUser);
	}
}