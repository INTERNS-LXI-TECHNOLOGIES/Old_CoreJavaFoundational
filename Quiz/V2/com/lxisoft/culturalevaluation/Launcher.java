package com.lxisoft.culturalevaluation;
import com.lxisoft.culturalevaluation.assessment.AssessmentController;
import com.lxisoft.culturalevaluation.user.UserController;
import com.lxisoft.culturalevaluation.question.QuestionController;


public class Launcher
{
	public static void main(String args[])
	{
		AssessmentController assessmentController=new AssessmentController();
		UserController userController=new UserController();
		QuestionController questionController=new QuestionController();
		assessmentController.setModelUserList(userController.loadUserFile());
		assessmentController.setCurrentUserModel(userController.getCurrentUser());
		assessmentController.setModelQuestionList(questionController.loadQuestionFile());
		assessmentController.setModelFinalTestScore(questionController.askQuestions(assessmentController.getModelQuestionList()));
		assessmentController.printResult();
	}
}