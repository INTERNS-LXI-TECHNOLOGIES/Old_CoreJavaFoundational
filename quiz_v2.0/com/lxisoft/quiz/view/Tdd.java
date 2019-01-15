package com.lxisoft.quiz.view;
import com.lxisoft.quiz.controller.QuestionPaperService;

/**
*This class is the main class
*
*@author Arya Vineesh
*
*@version 2.0
*/
public class Tdd
{
	public static void main(String arg[])
	{
		QuestionPaperService qPService=new QuestionPaperService();
		qPService.selectCategory();
	}
}