package com.lxisoft.quiz.quest;
import com.lxisoft.quiz.clear.*;
import com.lxisoft.quiz.user.*;
import java.util.*;

public class QuizController
{
	private QuizView quizview;
	private UserController usercontroller;
	
	public QuizController()
	{
		quizview=new QuizView();
		usercontroller=new UserController();
		
	}
}