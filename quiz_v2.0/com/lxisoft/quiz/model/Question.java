package com.lxisoft.quiz.model;
import java.util.*;
import java.util.logging.*;
/**
*This class is for control Question
*
*@author Arya Vineesh
*
*@version 1.5
*/
public class Question
{
	/**
	*This is an Id for the question
	*/
	
	private String questionId;
	
	/**
	*This is a question 
	*/
	
	private String question;
	
	/**
	*This is an arraylist of options for the questions
	*/
	
	private ArrayList<String> options;
	
	/**
	*This is the answer to the question
	*/
	
	private String answer;
	
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(Question.class.getName());
	
	/**
	*This is a setter which used for setting questionId
	*
	*@param questionId - the questionId to set
	*/
	
	public void setQuestionId(String questionId)
	{
		this.questionId=questionId;
	}
	
	/**
	*This is a getter which return the questionId
	*
	*@return questionId 
	*/
	
	public String toString()
	{
		return questionId;
	}
	
	/**
	*This is a setter which used for set question
	*
	*@param question - the question to be set
	*/
	
	public void setQuestion(String question)
	{
		log.info("Question class.............setQuestion............start");
		this.question=question;
		log.info("Question class.............setQuestion............end");
	}
	
	/**
	*This is a getter which returns the question
	*
	*@return question
	*/
	
	public String getQuestion()
	{
		log.info("Question class.............getQuestion............start/ends");
		return question;
		
	}
	/**
	*This is a setter which used for set options
	*
	*@param options - the options to set
	*/
	
	public void setOptions(ArrayList<String> options)
	{
		log.info("Question class.............setOptions............start");
		
		this.options=options;
		
		log.info("Question class.............setOptions............end");
	}
	
	/**
	*This is a getter which returns the options
	*
	*@return options
	*/
	
	public ArrayList<String> getOptions()
	{
		log.info("Question class.............getOptions............start/ends");
		
		return options;
	}
	
	/**
	*This is a setter which set the answer
	*
	*@param answer - the answer to set
	*/
	
	public void setAnswer(String answer)
	{
		log.info("Question class.............setAnswer............start");
		
		this.answer=answer;
		
		log.info("Question class.............setAnswer............end");
	}
	
	/**
	*This is a getter which returns the answer
	*
	*@return answer
	*/
	
	public String getAnswer()
	{
		log.info("Question class.............getAnswer............start/end");
		return answer;
	}
	
	
}