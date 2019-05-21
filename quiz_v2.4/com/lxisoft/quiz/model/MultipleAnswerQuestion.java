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
*Date Modified:21/5/2019
*/
public class MultipleAnswerQuestion extends Question
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(MultipleAnswerQuestion.class.getName());
	
	/**
	*This is the default constructor for MultipleAnswerQuestion class
	*/
	public MultipleAnswerQuestion()
	{
		log.setLevel(Level.SEVERE);
	}
	
	
	/**
	*This is an arraylist of options for the MultipleAnswerQuestion
	*/
	
	private ArrayList<String> options;
	
	/**
	*This is a setter which used for set options
	*
	*@param options - the options to set
	*/
	
	public void setOptions(ArrayList<String> options)
	{
		log.info("MultipleAnswerQuestion class.............setOptions............start");
		
		this.options=options;
		
		log.info("MultipleAnswerQuestion class.............setOptions............end");
	}
	
	/**
	*This is a getter which returns the options
	*
	*@return options
	*/
	
	public ArrayList<String> getOptions()
	{
		log.info("MultipleAnswerQuestion class.............getOptions............start/ends");
		
		return options;
	}
}