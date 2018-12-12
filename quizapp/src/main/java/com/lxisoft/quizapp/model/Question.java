package com.lxisoft.quizapp.model;

import com.lxisoft.quizapp.repository.annotation.*;

public class Question {

	@PrimaryKey
	@Type(value="int")
	private int id;
	
	@Type(value="text")
    private String question;

	@ForeignKey(table="Option" , column="id")
	@Type(value="int")
    private int optionId;

	@Type(value="varchar")
    private String answer;

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

    public String getQuestion()
	{
		return this.question;
	}

	public void setQuestion(String question)
	{
		this.question = question;
	}

	public int getOptionId()
	{
		return this.optionId;
	}

	public void setOptionId(int optionId)
	{
		this.optionId = optionId;
    }
    
    public String getAnswer()
	{
		return this.answer;
	}

	public void setAnswer(String answer)
	{
		this.answer = answer;
	}


}