package com.lxisoft.culturalevaluation.question;
import com.lxisoft.culturalevaluation.options.OptionListModel;

public class QuestionModel
{
	private String question;
	private OptionListModel optionList;
	
	public void setQuestion(String question)
	{
		this.question=question;
	}
	public String getQuestion()
	{
		return question;
	}
	public OptionListModel getOptionList()
	{
		return optionList;
	}
	public void setOptionListModel(OptionListModel optionList)
	{
		this.optionList=optionList;
	}
	public String toString()
	{
		return("\n"+question+"\n"+optionList);
	}
}