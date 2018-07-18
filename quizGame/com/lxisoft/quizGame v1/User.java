import java.util.*;
import java.lang.*;
import java.io.*;

public class User{
	private static final String FILENAME="E:/workspace/quizGame/com/lxisoft/quizGame v1/QuestionDb/question.txt";
	Question []q=new Question[20];
	public static Signup new_user=new Signup();
	public static LogIn pre_user=new LogIn();
	String []s=new String[20];
	String line;
	public void userInterface()throws Exception
	{	
		Scanner opt=new Scanner(System.in);
		do{System.out.println("\t\t\t\t******************Welcome to PlayQuiz Game******************\n");
		System.out.println("\t\t\t\t|1.Log In|\t\t|2.Sign Up|\t\t|3.Exit|\n");
		System.out.print("->");final int MAIN_OPTION=opt.nextInt();
		switch(MAIN_OPTION)
		{
			case 1:
			System.out.println("\t\t\t\t******************LOG IN INTERFACE******************\n");
			pre_user.logEntry();
			break;
			case 2:
			System.out.println("\t\t\t\t******************SIGN UP INTERFACE******************\n");
			new_user.regNew();
			break;
			case 3:
			System.out.println("\t\t\t\t******************THANK YOU FOR USING OUR PROGRAMM******************\n");
			System.exit(0);
			break;
			
			
		}
		}
		while(true);
		
		
		
	}
	
	public void cls()
	{
		Cls clrscr=new Cls();
		try{
			clrscr.cls();
		}
		catch(IOException e)
		{
			
		}
		catch(InterruptedException e)
		{
			
		}
	}
	
	
	
	
	public void check()
	{try{
	int i=0,mark=0;
	Scanner sc=new Scanner(System.in);
	FileReader fr=new FileReader(FILENAME);
	BufferedReader br=new BufferedReader(fr);
	while((line=br.readLine())!=null)
	{
	String s[]=line.split(";");
	q[i]=new Question(s);
	i++;
	}
	for(i=0;i<3;i++)
	{	cls();
		System.out.println(q[i].question+"\n\n"+"1: "+q[i].opt1+"\n\n"+"2: "+q[i].opt2+"\n\n"+"3: "+q[i].opt3+"\n\n"+"4: "+q[i].opt4);
		System.out.println("\n\n Enter correct option \n\n");
		System.out.print("->");int ch=sc.nextInt();
		
		switch(i)
		{
			
			case 0:
			if(ch==2)
				mark++;break;
			case 1:
			if(ch==4)
				mark++;break;
			case 2:
			if(ch==1)
				mark++;break;
			
		}
	}
	System.out.println("\t\t\t[Your Score is: "+mark*10+" out of 30]");
	}catch(Exception e)
	{
		System.out.println("ERROR");
	}
	
	
	}
	
	
	
}