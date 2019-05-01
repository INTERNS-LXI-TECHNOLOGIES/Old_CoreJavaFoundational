package com.lxisoft.quiz.model;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.quiz.model.Question;
/**
*This class is the model class for MultipleAnswerQuestion
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:1/5/2019
*/
public class MultipleAnswerQuestion extends Question
{
	public MultipleAnswerQuestion()
	{
		log.setLevel(Level.SEVERE);
	}
	
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(Question.class.getName());
	/**
	*This is an arraylist of options for the questions
	*/
	
	private ArrayList<String> options;
	
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
}