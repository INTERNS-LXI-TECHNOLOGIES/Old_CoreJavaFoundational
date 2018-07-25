package com.lxisoft.culturalevaluation.options;

public class OptionListController
{
	public OptionListModel setScores(String scores)
	{
		String[] individualScores=scores.split(",");
		OptionListModel optionList=new OptionListModel();
		optionList.setOptionA_Score(Integer.parseInt(individualScores[0]));
		optionList.setOptionB_Score(Integer.parseInt(individualScores[1]));
		optionList.setOptionC_Score(Integer.parseInt(individualScores[2]));
		optionList.setOptionD_Score(Integer.parseInt(individualScores[3]));
		return optionList;
	}
}