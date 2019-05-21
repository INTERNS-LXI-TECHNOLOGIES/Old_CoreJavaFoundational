package com.lxisoft.quiz.model;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Level;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.MultipleAnswerQuestion;
import com.lxisoft.quiz.model.MultipleChoiceQuestion;
import com.lxisoft.quiz.model.TrueOrFalseQuestion;
/**
*This class is the model class QuestionPaper
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:21/5/2019
*/
public class QuestionPaper
{
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(QuestionPaper.class.getName());
	
	/**
	*This is the default constructor of the QuestionPaper class
	*/
	public QuestionPaper()
	{
		log.setLevel(Level.SEVERE);
	}
	
	/**
	*This is an arraylist of multiple answer questions for the user
	*/
	
	private ArrayList<MultipleAnswerQuestion> multipleAnswerQuestion;
	
	/**
	*This is an arraylist of multiple choice questions for the user
	*/
	
	private ArrayList<MultipleChoiceQuestion> multipleChoiceQuestion;
	
	/**
	*This is an arraylist of true or false questions for the user
	*/
	
	private ArrayList<TrueOrFalseQuestion> trueOrFalseQuestion;
	
	
	
	/**
	*This is a setter which used for setting multiple answer questions
	*
	*@param multipleAnswerQuestion - the questions to set
	*/
	
	public void setMultipleAnswerQuestion(ArrayList<MultipleAnswerQuestion> multipleAnswerQuestion)
	{
		log.info("QuestionPaper class.............setMultipleAnswerQuestion............start");
		
		this.multipleAnswerQuestion=multipleAnswerQuestion;
		
		log.info("QuestionPaper class.............setMultipleAnswerQuestion............end");
	}
	
	/**
	*This is a getter which returns the multipleAnswerQuestion
	*
	*@return multipleAnswerQuestion
	*/
	
	public ArrayList<MultipleAnswerQuestion> getMultipleAnswerQuestion()
	{
		log.info("QuestionPaper class.............getMultipleAnswerQuestion............start/ends");
		
		return multipleAnswerQuestion;
	}
	
	/**
	*This is a setter which used for set multiple Choice questions
	*
	*@param multipleChoiceQuestion - the multipleChoiceQuestion to set
	*/
	
	public void setMultipleChoiceQuestion(ArrayList<MultipleChoiceQuestion> multipleChoiceQuestion)
	{
		log.info("QuestionPaper class.............setMultipleChoiceQuestion............start");
		
		this.multipleChoiceQuestion=multipleChoiceQuestion;
		
		log.info("QuestionPaper class.............setMultipleChoiceQuestion............end");
	}
	
	/**
	*This is a getter which returns the MultipleChoiceQuestion
	*
	*@return multipleChoiceQuestion
	*/
	
	public ArrayList<MultipleChoiceQuestion> getMultipleChoiceQuestion()
	{
		log.info("QuestionPaper class.............getMultipleChoiceQuestion............start/ends");
		
		return multipleChoiceQuestion;
	}
	
	/**
	*This is a setter which used for set the True or False questions
	*
	*@param trueOrFalseQuestion - the questions to set
	*/
	
	public void setTrueOrFalseQuestion(ArrayList<TrueOrFalseQuestion> trueOrFalseQuestion)
	{
		log.info("QuestionPaper class.............setTrueOrFalseQuestion............start");
		
		this.trueOrFalseQuestion=trueOrFalseQuestion;
		
		log.info("QuestionPaper class.............setTrueOrFalseQuestion............end");
	}
	
	/**
	*This is a getter which returns the True or False questions
	*
	*@return trueOrFalseQuestion
	*/
	
	public ArrayList<TrueOrFalseQuestion> getTrueOrFalseQuestion()
	{
		log.info("QuestionPaper class.............getTrueOrFalseQuestion............start/ends");
		
		return trueOrFalseQuestion;
	}
}