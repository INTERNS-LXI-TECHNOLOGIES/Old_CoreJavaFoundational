package com.lxisoft.quiztask.question;

public class Question
{
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String answer;
	
	public Question(String[] str)
	{
		for(int i=0;i<str.length;i++)
		{
			switch(i)
			{
				case 0:question=str[i];break;
				case 1:optionA=str[i];break;
				case 2:optionB=str[i];break;
				case 3:optionC=str[i];break;
				case 4:optionD=str[i];break;
				case 5:answer=str[i];break;
			}
		}
	}
	public String toString()
	{
		return(question+"\n\n1."+optionA+"\n\n2."+optionB+"\n\n3."+optionC+"\n\n4."+optionD);
	}
	public boolean isCorrect(int ans)
	{
		String givenAnswer=null;
		switch(ans)
		{
			case 1:givenAnswer=optionA;break;
			case 2:givenAnswer=optionB;break;
			case 3:givenAnswer=optionC;break;
			case 4:givenAnswer=optionD;break;
		}
		if(givenAnswer.equals(answer))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}