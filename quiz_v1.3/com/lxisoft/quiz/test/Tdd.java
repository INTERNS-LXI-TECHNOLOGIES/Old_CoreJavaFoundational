package com.lxisoft.quiz.test;
import com.lxisoft.quiz.service.QuestionPaperService;
/**
*This class is the main class
*
*@author Arya Vineesh
*
*@version 1.4
*/
public class Tdd
{
	/**
	*main method
	*/
	public static void main(String arg[])
	{
		QuestionPaperService qService=new QuestionPaperService();
		qService.selectCategory();
	}
}