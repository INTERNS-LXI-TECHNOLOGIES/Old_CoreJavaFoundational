package com.lxisoft.quizgamev2.userinterface;
import java.util.*;
public class Interface_model{
	private String filename,question,opt1,opt2,opt3,opt4;
	private String word[]=new String[30];
	private int length,mark;
	////////////////////////////file line///////////////////////
	public void setMark(int mark)
	{
		this.mark=mark;
	}
	public int getMark()
	{
		return mark;
	}
	/////////////////////////////line//////////////////////////
	public void setFilename(String filename)
	{
		this.filename=filename;
	}
	public String getFilename()
	{
		return filename;
	}
	////////////////////////////word///////////////////////
	public void setWord(String word[])
	{
		this.word=word;
	}
	public String[] getWord()
	{
		return word;
	}
	/////////////////////////////////////////length/////////////////////////
	public void setLength(int length)
	{
		this.length=length;
	}
	public int getLength()
	{
		return length;
	}
	/////////////////////////////////////////question/////////////////////////
	public void setQuestion(String question)
	{
		this.question=question;
	}
	public String getQuestion()
	{
		return question;
	}
	/////////////////////////////////////////option1/////////////////////////
	public void setOption1(String opt1)
	{
		this.opt1=opt1;
	}
	public String getOption1()
	{
		return opt1;
	}
	/////////////////////////////////////////option2/////////////////////////
	public void setOption2(String opt2 )
	{
		this.opt2=opt2;
	}
	public String getOption2()
	{
		return opt2;
	}
	/////////////////////////////////////////option3/////////////////////////
	public void setOption3(String opt3)
	{
		this.opt3=opt3;
	}
	public String getOption3()
	{
		return opt3;
	}
	/////////////////////////////////////////option4/////////////////////////
	public void setOption4(String opt4)
	{
		this.opt4=opt4;
		
	}
	public String getOption4()
	{
		return opt4;
	}
	
}