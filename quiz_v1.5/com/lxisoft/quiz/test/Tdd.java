package com.lxisoft.quiz.test;
import com.lxisoft.quiz.service.QuestionPaperService;
/**
*This class is the main class
*
*@author Arya Vineesh
*
*@version 1.5
*/
public class Tdd
{
	/**
	*this method is used as the main method
	*
	*@param arg[]- which is the argument 
	*/
	public static void main(String arg[])
	{
		QuestionPaperService qService=new QuestionPaperService();
		qService.selectCategory();
	}
}