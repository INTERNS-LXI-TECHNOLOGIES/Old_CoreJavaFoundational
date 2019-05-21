package com.lxisoft.quiz.control;
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
*This class is the control class for quiz
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:21/5/2019
*/
public class QuizControl
{
	
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(QuizControl.class.getName());
	
	/**
	*This method is used for checking whether the answer is correct or wrong
	*@param answer - the answer choosen by the user
	*@param correctAnswer - the correct answer for the question
	*/
	public boolean isCorrect(String answer,String correctAnswer)
	{
		log.info("QuizControl class.........isCorrect........start/end");
		if(answer.equals(correctAnswer))
		{
			return true;
		}  
		else
		{
			return false;
		}
	}
}