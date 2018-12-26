package com.lxisoft.quiz.domain;
import java.util.logging.*;
/**
*This class is for control QuestionPaper
*
*@author Arya Vineesh
*
*@version 1.1
*/
public class QuestionPaper
{
	/**
	*This is a question for user
	*/
	
	private String question;
	
	/**
	*This is the  options for the question
	*/
	
	private String[] options;
	
	
	
	/**
	*This is the answer to the question
	*/
	
	private String answer;
	
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(QuestionPaper.class.getName());
	 
	/**
	*This is a setter which set the question
	*
	*@param question - the question to set
	*/
	
	public void setQuestion(String question)
	{
		log.info("QuestionPaper class.............setQuestion............start");
		
		this.question=question;
		
		log.info("QuestionPaper class.............setQuestion............end");
	}
	
	/**
	*This is a setter which set the options
	*
	*@param options - the options to set
	*/
	
	public void setOptions(String[] options)
	{
		log.info("QuestionPaper class.............setOptions............start");
		
		this.options=options;
		
		log.info("QuestionPaper class.............setOptions............end");
	}
	
	/**
	*This is a setter which set the answer
	*
	*@param answer - the answer to set
	*/
	
	public void setAnswer(String answer)
	{
		log.info("QuestionPaper class.............setAnswer............start");
		
		this.answer=answer;
		
		log.info("QuestionPaper class.............setAnswer............end");
	}
	
	/**
	*This is a getter which returns the question
	*
	*@return question - the question to get
	*/
	
	public String getQuestion()
	{
		log.info("QuestionPaper class.............getQuestion............start/end");
		return question;
	}
	
	/**
	*This is a getter which returns the options
	*
	*@return options
	*/
	
	public String[] getOptions()
	{
		log.info("QuestionPaper class.............getOptions............start/end");
		return options;
	}
	
	/**
	*This is a getter which returns the answer
	*
	*@return answer
	*/
	
	public String getAnswer()
	{
		log.info("QuestionPaper class.............getAnswer............start");
		return answer;
	}
	
	
}