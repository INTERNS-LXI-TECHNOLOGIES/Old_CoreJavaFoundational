package com.lxisoft.quiz.quest;
public class Questions
{
	private	String que,Option1,Option2,Option3,Option4;
	private String mark1,mark2,mark3,mark4;
	private int totalmark;
	public Questions(String que,String Option1,String Option2,String Option3,String Option4,String mark1,String mark2,String mark3,String mark4)
	{
		this.que=que;
		this.Option1=Option1;
		this.Option2=Option2;
		this.Option3=Option3;
		this.Option4=Option4;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
	}
	public String getQuestion()
	{
		return que;
	}
	public String getOption1()
	{
		return Option1;
	}
	public String getOption2()
	{
		return Option2;
	}
	public String getOption3()
	{
		return Option3;
	}
	public String getOption4()
	{
		return Option4;
	}
	public void setMark1(String mark1)
	{
		this.mark1=mark1;
	}
	public void setMark2(String mark2)
	{
		this.mark2=mark2;
	}
	public void setMark3(String mark3)
	{
		this.mark3=mark3;
	}
	public void setMark4(String mark4)
	{
		this.mark4=mark4;
	}
	public String getMark1()
	{
		return mark1;
	}
	public String getMark2()
	{
		return mark2;
	}
	public String getMark3()
	{
		return mark3;
	}
	public String getMark4()
	{
		return mark4;
	}
	public void setTotalmark(int totalmark)
	{
		this.totalmark=totalmark;
	}
	public int getTotalmark()
	{
		return totalmark;
	}
	

}