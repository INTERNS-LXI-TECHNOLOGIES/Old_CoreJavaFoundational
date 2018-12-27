package com.lxisoft.quiz.domain;
import java.util.*;
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
	*This is the  option1 for the question
	*/
	
	private String option1;
	
	/**
	*This is the second option for the question
	*/
	
	private String option2;
	
	/**
	*This is the third option for the question
	*/
	
	private String option3;
	
	/**
	*This is the fourth option for the question
	*/
	
	private String option4;
	
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
	*This is a setter which set the option1
	*
	*@param option1 - the option1 to set
	*/
	
	public void setOption1(String option1)
	{
		log.info("QuestionPaper class.............setOption1............start");
		
		this.option1=option1;
		
		log.info("QuestionPaper class.............setOption1............end");
	}
	
	/**
	*This is a setter which set the option2
	*
	*@param option2 - the option2 to set
	*/
	
	public void setOption2(String option2)
	{
		log.info("QuestionPaper class.............setOption2............start");
		
		this.option2=option2;
		
		log.info("QuestionPaper class.............setOption2............end");
	}
	
	/**
	*This is a setter which set the option3
	*
	*@param option3 - the option3 to set
	*/
	
	public void setOption3(String option3)
	{
		log.info("QuestionPaper class.............setOption3............start");
		
		this.option3=option3;
		
		log.info("QuestionPaper class.............setOption3............end");
	}
	
	/**
	*This is a setter which set the option4
	*
	*@param option4 - the option4 to set
	*/
	
	public void setOption4(String option4)
	{
		log.info("QuestionPaper class.............setOption4............start");
		
		this.option4=option4;
		
		log.info("QuestionPaper class.............setOption4............end");
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
	*This is a getter which returns the option1
	*
	*@return option1
	*/
	
	public String getOption1()
	{
		log.info("QuestionPaper class.............getOption1............start/end");
		return option1;
	}
	
	/**
	*This is a getter which returns the option2
	*
	*@return option2
	*/
	
	public String getOption2()
	{
		log.info("QuestionPaper class.............getOption2............start/end");
		return option2;
	}
	
	/**
	*This is a getter which returns the option3
	*
	*@return option3
	*/
	
	public String getOption3()
	{
		log.info("QuestionPaper class.............getOption3............start/end");
		return option3;
	}
	
	/**
	*This is a getter which returns the option4
	*
	*@return option4
	*/
	
	public String getOption4()
	{
		log.info("QuestionPaper class.............getOption4............start/end");
		return option4;
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