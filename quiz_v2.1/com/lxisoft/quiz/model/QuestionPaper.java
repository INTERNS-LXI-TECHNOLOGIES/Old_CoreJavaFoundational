package com.lxisoft.quiz.model;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.quiz.model.Question;
/**
*This class is the model class QuestionPaper
*
*@author Arya Vineesh
*
*@version 2.1
*/

public class QuestionPaper
{
	/**
	*This is an arraylist of questions for the user
	*/
	
	private ArrayList<Question> questions;
	
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(QuestionPaper.class.getName());
	
	/**
	*This is a setter which used for set questions
	*
	*@param questions - the questions to set
	*/
	
	public void setQuestions(ArrayList<Question> questions)
	{
		log.info("QuestionPaper class.............setQuestions............start");
		
		this.questions=questions;
		
		log.info("QuestionPaper class.............setQuestions............end");
	}
	
	/**
	*This is a getter which returns the questions
	*
	*@return questions
	*/
	
	public ArrayList<Question> getQuestions()
	{
		log.info("QuestionPaper class.............getQuestions............start/ends");
		
		return questions;
	}
	
}
