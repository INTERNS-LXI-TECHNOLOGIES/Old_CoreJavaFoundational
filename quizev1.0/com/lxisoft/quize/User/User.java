package com.lxisoft.quize.User;
import com.lxisoft.quize.Quize.*;
import com.lxisoft.quize.clear.*;
import java.io.*;
import java.util.*;
import java.io.IOException;

public class User{
	private static final String FILENAME2 = "D:/workspace/quizev1.0/Files/questions.txt";
	Questions[] q = new Questions[20];
	String[] s=new String[20];
	int ch,count,mark=0,len,i=0;
	String line1;
	public void check(){
		try{
		Scanner sc = new Scanner(System.in);
		FileReader fr1 = new FileReader(FILENAME2);
		BufferedReader br1 = new BufferedReader(fr1);
			   // System.out.println("////");
				while((line1=br1.readLine())!=null){
				String s[] = line1.split(";");
				//System.out.println(s[0]);
				q[i] = new Questions(s);
				i++;
			}
		
		for(int i=0;i<10;i++){
			System.out.println(q[i].que+"\n\n"+"1: "+q[i].option1+"\n\n"+"2: "+q[i].option2+"\n\n"+"3: "+q[i].option3+"\n\n"+"4: "+q[i].option4);
			System.out.println("Enter your correct option\n\n");
			ch = sc.nextInt();
			cls();
			switch(i){
				case 0: if(ch==4)
					    mark++;break;
				case 1: if(ch==1)
					    mark++;break;
				case 2: if(ch==1)
					    mark++;break;
				case 3: if(ch==1)
					    mark++;break;
				case 4: if(ch==1)
					    mark++;break;
				case 5: if(ch==4)
					    mark++;break;
				case 6: if(ch==4)
					    mark++;break;
				case 7: if(ch==4)
					    mark++;break;
				case 8: if(ch==2)
					    mark++;break;
				case 9: if(ch==4)
					    mark++;break;
				default: System.out.println("Entered a wrong choice");
			}
		}
}catch(IOException e){
			System.out.println("Error");	
		}
	System.out.println("****************************************");	
	System.out.println("\n"+"\n"+"\n");
	System.out.println("YOUR SCORE IS         "+mark+" out of 10");
	if(mark>=5){
		System.out.println("YOU HAVE SUCCESSFULLY CLEARED THE TEST");
	}else
	{
		System.out.println("YOU HAVE FAILED......BETTER LUCK NEXT TIME");
	}
	System.out.println("\n"+"\n"+"\n");
	System.out.println("****************************************");	
}

public void cls()
	{
		Cls clrscr=new Cls();
		try
		{
			clrscr.cls();
		}
		catch (IOException e)
		{
			
		}
		catch (InterruptedException e)
		{
			
		}
	}
}