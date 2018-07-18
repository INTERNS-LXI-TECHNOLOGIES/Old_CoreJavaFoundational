public class Question{
	public String question,opt1,opt2,opt3,opt4;
	public Question(String[] str)
	{
		int len=0;
		len=str.length;
		for(int i=0;i<len;i++)
		{
			switch(i)
			{
				case 0:
				question=str[i];
				break;
				case 1:
				opt1=str[i];
				break;
				case 2:
				opt2=str[i];
				break;
				case 3:
				opt3=str[i];
				break;
				case 4:
				opt4=str[i];
				break;
			}
		}
	}
}