package com.lxisoft.technicalQuiz.quiz;
public class Question
{   String stringQuestion,option1,option2,option3,option4,correctOption;
	int questionNo;
	public void setQuestionNo(int questionNo)
	{
		this.questionNo=questionNo;
	}
	public int getQuestionNo()
	{
		return this.questionNo;
	}
	public void setQuestion(String question)
	{
		this.stringQuestion=question;
	}
	public String getQuestion()
	{
		return this.stringQuestion;
	}
	public void setOption1(String option)
	{
		this.option1=option;
	}
	public String getOption1()
	{
		return this.option1;
	}
	public void setOption2(String option)
	{
		this.option2=option;
	}
	public String getOption2()
	{
		return this.option2;
	}
	public void setOption3(String option)
	{
		this.option3=option;
	}
	public String getOption3()
	{
		return this.option3;
	}
	public void setOption4(String option)
	{
		this.option4=option;
	}
	public String getOption4()
	{
		return this.option4;
	}
	public void setCorrectOption(String option)
	{
		this.correctOption=option;
	}
	public String getCorrectOption()
	{
		return this.correctOption;
	}
	
}