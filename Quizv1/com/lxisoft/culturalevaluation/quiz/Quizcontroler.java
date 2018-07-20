package com.lxisoft.culturalevaluation.quiz;
import com.lxisoft.culturalevaluation.user.Usercontroler;
import com.lxisoft.culturalevaluation.question.Questioncontroler;
import com.lxisoft.culturalevaluation.quiz.*;
public class Quizcontroler
{
	private QuizModel quizmod;
	private Quizview quizview;
	public Quizcontroler()
	{
		quizview=new Quizview();
		quizview.loginView();
		Usercontroler userctrl;
		Questioncontroler quectrl;
		
	}
	
}