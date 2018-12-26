package com.lxisoft.quiz.test;
import com.lxisoft.quiz.service.QuestionPaperService;
public class Tdd
{
	public static void main(String arg[])
	{
		QuestionPaperService qService=new QuestionPaperService();
		qService.createQuestionpaper();
	}
}