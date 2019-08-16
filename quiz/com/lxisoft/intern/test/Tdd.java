package com.lxisoft.intern.test;
import com.lxisoft.intern.quiz.Quiz;
import com.lxisoft.intern.quiz.Question;

public class Tdd
{
	public static void main(String[] arg)
	{

		Quiz q = new Quiz();
		q.createQuestion();
		q.displayQuiz();
	}
}