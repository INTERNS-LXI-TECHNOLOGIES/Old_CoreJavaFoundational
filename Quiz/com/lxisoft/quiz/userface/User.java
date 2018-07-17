package com.lxisoft.quiz.userface;
import com.lxisoft.quiz.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.*;
import java.io.File;
import java.io.IOException; 
public class User
{
	
	String userName,passWord;
	
	public void Login()
	
	{  	
		File file=new File("./com/lxisoft/quiz/file/doc.txt");
		
		Scanner input=new Scanner(System.in);
		System.out.println("USER NAME:");
		userName=input.nextLine();
		System.out.println("PASS WORD:");
		passWord=input.nextLine();
		
		try
		{
			String user;
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String username="", password="";
			while((user = br.readLine())!=null)
			{
			int i=0;
			char st;
			while((st = user.charAt(i))!=';')
				{
		
					username+=st;
					i++;
				}
				//System.out.println(username);
				i++;
			while((st=user.charAt(i))!= ';')
				{
					password+=st;
					i++;
				}
				//System.out.println(password);
		
		if((userName.equals(username))&&(passWord.equals(password)))
			{
			System.out.println("Login Successfully");
			}
		}
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
}