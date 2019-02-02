package com.lxisoft.quiz.model;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.MultipleAnswerQuestion;
import com.lxisoft.quiz.model.MultipleChoiceQuestion;
import com.lxisoft.quiz.model.TrueOrFalseQuestion;
/**
*This class is the model class QuestionPaper
*
*@author Arya Vineesh
*
*@version 2.2
*/
public class QuestionPaper
{
	/**
	*This is an arraylist of questions for the user
	*/
	
	private ArrayList<MultipleAnswerQuestion> multipleAnswerQuestion;
	
	/**
	*This is an arraylist of questions for the user
	*/
	
	private ArrayList<MultipleChoiceQuestion> multipleChoiceQuestion;
	
	/**
	*This is an arraylist of questions for the user
	*/
	
	private ArrayList<TrueOrFalseQuestion> trueOrFalseQuestion;
	/**
	*Reference Logger class to get log messages
	*/
	
	private static final Logger log=Logger.getLogger(QuestionPaper.class.getName());
	
	/**
	*This is a setter which used for set questions
	*
	*@param questions - the questions to set
	*/
	
	public void setMultipleAnswerQuestion(ArrayList<MultipleAnswerQuestion> multipleAnswerQuestion)
	{
		log.info("QuestionPaper class.............setQuestions............start");
		
		this.multipleAnswerQuestion=multipleAnswerQuestion;
		
		log.info("QuestionPaper class.............setQuestions............end");
	}
	
	/**
	*This is a getter which returns the questions
	*
	*@return questions
	*/
	
	public ArrayList<MultipleAnswerQuestion> getMultipleAnswerQuestion()
	{
		log.info("QuestionPaper class.............getQuestions............start/ends");
		
		return multipleAnswerQuestion;
	}
	
	/**
	*This is a setter which used for set questions
	*
	*@param questions - the questions to set
	*/
	
	public void setMultipleChoiceQuestion(ArrayList<MultipleChoiceQuestion> multipleChoiceQuestion)
	{
		log.info("QuestionPaper class.............setQuestions............start");
		
		this.multipleChoiceQuestion=multipleChoiceQuestion;
		
		log.info("QuestionPaper class.............setQuestions............end");
	}
	
	/**
	*This is a getter which returns the questions
	*
	*@return questions
	*/
	
	public ArrayList<MultipleChoiceQuestion> getMultipleChoiceQuestion()
	{
		log.info("QuestionPaper class.............getQuestions............start/ends");
		
		return multipleChoiceQuestion;
	}
	
	/**
	*This is a setter which used for set questions
	*
	*@param questions - the questions to set
	*/
	
	public void setTrueOrFalseQuestion(ArrayList<TrueOrFalseQuestion> trueOrFalseQuestion)
	{
		log.info("QuestionPaper class.............setQuestions............start");
		
		this.trueOrFalseQuestion=trueOrFalseQuestion;
		
		log.info("QuestionPaper class.............setQuestions............end");
	}
	
	/**
	*This is a getter which returns the questions
	*
	*@return questions
	*/
	
	public ArrayList<TrueOrFalseQuestion> getTrueOrFalseQuestion()
	{
		log.info("QuestionPaper class.............getQuestions............start/ends");
		
		return trueOrFalseQuestion;
	}
}