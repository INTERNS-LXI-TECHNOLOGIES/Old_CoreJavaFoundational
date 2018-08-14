package com.lxisoft.culturalevaluation.quiz;
import com.lxisoft.culturalevaluation.user.*;
import com.lxisoft.culturalevaluation.question.*;
import com.lxisoft.culturalevaluation.quiz.*;
public class Quizcontroler
{
	private Quizview quizview;
	private Usercontroler userctrl;
	private Questioncontroler quesctrl;
	public Quizcontroler()
	{
		quizview=new Quizview();
		userctrl=new Usercontroler();
		quesctrl=new Questioncontroler();
		
	}
	
} 