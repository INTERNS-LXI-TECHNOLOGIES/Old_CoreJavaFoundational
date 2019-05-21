package com.lxisoft.quiz.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.quiz.model.Question;
/**
*This class is the model class for TrueOrFalseQuestion
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:21/5/2019
*/
public class TrueOrFalseQuestion extends Question
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(TrueOrFalseQuestion.class.getName());
	
	
	/**
	*This is the boolean value to corresponding to the answer is true/false
	*/
	private boolean isTrue=false;
	
	
	/**
	*This is a setter for status of answer
	*
	*@param isTrue - the status of the answer
	*/
	
	public void setIsTrue(boolean isTrue)
	{
		log.info("TrueOrFalseQuestion class.............setIsTrue............start");
		this.isTrue=isTrue;
		log.info("TrueOrFalseQuestion class.............setIsTrue............ends");
	}
	
	/**
	*This is a getter which return status of answer
	*
	*@return isTrue
	*/
	
	public boolean getIsTrue()
	{
		log.info("TrueOrFalseQuestion class.............getIsTrue............start/ends");
		return isTrue;
		
	}
}