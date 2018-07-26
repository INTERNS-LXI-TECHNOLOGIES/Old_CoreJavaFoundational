package com.lxisoft.quizgamev2.userinterface;
public class Question_controller extends Interface_model{
	public Interface_model inter=new Interface_model();
	public String que,op1,op2,op3,op4;
	public Question_controller(String[] str)
	{	
		inter.setLength(str.length);
		for(int i=0;i<inter.getLength();i++)
		{
			switch(i)
			{
				case 0:
				inter.setQuestion(str[i]);
				que=inter.getQuestion();
				break;
				case 1:
				inter.setOption1(str[i]);
				op1=inter.getOption1();
				break;
				case 2:
				inter.setOption2(str[i]);
				op2=inter.getOption2();
				break;
				case 3:
				inter.setOption3(str[i]);
				op3=inter.getOption3();
				break;
				case 4:
				inter.setOption4(str[i]);
				op4=inter.getOption4();
				break;
			}
		}
	}
}