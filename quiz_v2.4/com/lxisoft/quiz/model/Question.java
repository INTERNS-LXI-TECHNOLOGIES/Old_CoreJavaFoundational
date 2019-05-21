package com.lxisoft.quiz.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
/**
*This class is the model class for Question
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:21/5/2019
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
	*This is the set of answers to the question
	*/
	private String[] answers;
	
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
		log.info("Question class.............setQuestionId............start");
		this.questionId=questionId;
		log.info("Question class.............setQuestionId............ends");
	}
	
	/**
	*This is a getter which return the questionId
	*
	*@return questionId 
	*/
	
	public String toString()
	{
		log.info("Question class.............toString............start/ends");
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
	*@return answer - the answer to the question
	*/
	
	public String getAnswer()
	{
		log.info("Question class.............getAnswer............start/end");
		return answer;
	}
	
	/**
	*This is a setter used to set answers
	*
	*@param answers - the answers to the question
	*/
	public void setAnswers(String[] answers)
	{
		log.info("Question class.............setAnswers............start");
		this.answers=answers;
		log.info("Question class.............setAnswers............end");
	}
	
	/**
	*This is a getter which returns answers to the question
	*
	*@return answers - the answers to the questions
	*/
	public String[] getAnswers()
	{
		log.info("Question class.............getAnswers............start/end");
		return answers;
	}
	
	
}