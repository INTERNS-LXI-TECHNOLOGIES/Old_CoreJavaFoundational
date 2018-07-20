package com.lxisoft.quizz.quest;
import com.lxisoft.quizz.user.UserController;
import com.lxisoft.quizz.quest.QuestionController;
public class QuizController
{
	private QuizModel quizmodel;
	private QuizView quizview;
	public QuizController()
	{
		quizview=new QuizView();
		UserController usercont;
		QuestionController Questioncont;
	}
}