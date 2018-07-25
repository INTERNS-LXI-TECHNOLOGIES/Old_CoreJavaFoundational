package com.lxisoft.culturalevaluation;
import com.lxisoft.culturalevaluation.assessment.AssessmentController;
import com.lxisoft.culturalevaluation.user.UserController;


public class Launcher
{
	public static void main(String args[])
	{
		AssessmentController assessmentController=new AssessmentController();
		UserController userController=new UserController();
		assessmentController.setModelUserList(userController.loadUserFile());
		assessmentController.setCurrentUserModel(userController.getCurrentUser());
	}
}