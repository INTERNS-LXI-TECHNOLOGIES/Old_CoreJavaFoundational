package com.lxisoft.culturalevaluation.question;
import java.util.ArrayList;
import com.lxisoft.culturalevaluation.options.OptionListModel;
import com.lxisoft.culturalevaluation.options.OptionListController;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class QuestionController
{
	QuestionView view=new QuestionView();
	public ArrayList<QuestionModel> loadQuestionFile()
	{
		ArrayList<QuestionModel> questions=new ArrayList<QuestionModel>();
		try
		{
			File questionFile=new File("./com/lxisoft/culturalevaluation/database/questionFile.txt");
			BufferedReader reader=new BufferedReader(new FileReader(questionFile));
			String line;
			while((line=reader.readLine())!=null)
			{
				String[] questionAndScores=line.split(";");
				String questionString=questionAndScores[0];
				String optionScores=questionAndScores[1];
				QuestionModel question=new QuestionModel();
				question.setQuestion(questionString);
				OptionListController optionListController=new OptionListController();
				OptionListModel optionList=optionListController.setScores(optionScores);
				question.setOptionListModel(optionList);
				questions.add(question);
			}
		}
		catch(IOException e)
		{
			view.printError("File not found...");
		}
		return questions;
	}
	public int askQuestions(ArrayList<QuestionModel> questions)
	{
		int score=0;
		for(QuestionModel question:questions)
		{
			char choice=view.ask(question);
			score+=updateScore(choice,question);
		}
		return score;
	}
	public int updateScore(char choice,QuestionModel question)
	{
		char ch=Character.toLowerCase(choice);
		OptionListModel optionList=question.getOptionList();
		switch(ch)
		{
			case 'a':return optionList.getOptionA_Score();
			case 'b':return optionList.getOptionB_Score();
			case 'c':return optionList.getOptionC_Score();
			case 'd':return optionList.getOptionD_Score();
			default: view.printError("Wrong Option"); return 0;
		}
	}
}