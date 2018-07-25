package com.lxisoft.culturalevaluation.options;

public class OptionListModel
{
	private static String optionA="Strongly Disagree";
	private static String optionB="Disagree";
	private static String optionC="Agree";
	private static String optionD="Strongly Agree";

	private int optionA_Score;
	private int optionB_Score;
	private int optionC_Score;
	private int optionD_Score;
	
	public static String getOptionA()
	{
		return optionA;
	}public static String getOptioB()
	{
		return optionB;
	}public static String getOptionC()
	{
		return optionC;
	}public static String getOptionD()
	{
		return optionD;
	}
	public void setOptionA_Score(int optionA_Score)
	{
		this.optionA_Score=optionA_Score;
	}
	public void setOptionB_Score(int optionB_Score)
	{
		this.optionB_Score=optionB_Score;
	}
	public void setOptionC_Score(int optionC_Score)
	{
		this.optionC_Score=optionC_Score;
	}
	public void setOptionD_Score(int optionD_Score)
	{
		this.optionD_Score=optionD_Score;
	}
	public int getOptionA_Score()
	{
		return optionA_Score;
	}
	public int getOptionB_Score()
	{
		return optionB_Score;
	}
	public int getOptionC_Score()
	{
		return optionC_Score;
	}
	public int getOptionD_Score()
	{
		return optionD_Score;
	}
	public String toString()
	{
		return("\nA."+optionA+"\nB."+optionB+"\nC."+optionC+"\nD."+optionD);
	}
}