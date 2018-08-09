package com.lxisoft.wayout.domain;
import java.util.*;
/**
*@author Arya
*It is a  model class for SecurityQuestion
*/
public class SecurityQuestion
{
	private String Question;
	
	private ArrayList<String> Options=new ArrayList<String>();
	private String Answer;
	/**
	*@param question
	*is used to set the value for question
	*/
	public void setQuestion(String question)
	{
		this.Question=question;
	}
	/**
	*return Question
	*retrive the value of Question
	*/
	public String getQuestion()
	{
		return Question;
	}
	/**
	*@param options
	*method to set the options
	*/
	public void setOptions(ArrayList<String> options)
	{
		this.Options=options;
	}
	/**
	*return Options
	*retrive the value of Options
	*/
	public ArrayList<String> getOptions()
	{
		return Options;
	}
	/**
	*@param answer
	*method to set the answer
	*/
	public void setAnswer(String answer)
	{
		this.Answer=answer;
	}
	/**
	*return Answer
	*method to retrive the value Answer
	*/
	public String getAnswer()
	{
		return Answer;
	}
}