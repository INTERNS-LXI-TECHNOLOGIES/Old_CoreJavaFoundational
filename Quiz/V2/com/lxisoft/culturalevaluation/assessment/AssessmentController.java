package com.lxisoft.culturalevaluation.assessment;
import com.lxisoft.culturalevaluation.user.UserController;
import java.util.ArrayList;
import com.lxisoft.culturalevaluation.user.UserModel;
import com.lxisoft.culturalevaluation.question.QuestionModel;

public class AssessmentController
{
	private AssessmentModel model;
	private AssessmentView view;
	
	public AssessmentController()
	{
		model=new AssessmentModel();
		view=new AssessmentView();
	}
	public void setModelUserList(ArrayList<UserModel> userList)
	{
		model.setUserList(userList);
	}
	public void setCurrentUserModel(UserModel currentUser)
	{
		model.setCurrentUser(currentUser);
	}
	public void setModelQuestionList(ArrayList<QuestionModel> questionList)
	{
		model.setQuestionList(questionList);
	}
	public void setModelFinalTestScore(int testScore)
	{
		model.setFinalTestScore(testScore);
	}
	public ArrayList<QuestionModel> getModelQuestionList()
	{
		return model.getQuestionList();
	}
	public void printResult()
	{
		view.printScore(model.getFinalTestScore());
	}
}