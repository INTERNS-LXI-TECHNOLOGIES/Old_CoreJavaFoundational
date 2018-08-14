package com.lxisoft.culturalevaluation.user;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class Usercontroler
{
	private Usermodel usermod;
	private Userview userview;
	String username,password;
	public Usercontroler()
	{
		login();
	}
	public void login()
	{
		Scanner input=new Scanner(System.in);
		userview=new Userview();
		userview.askUsername();
		username=input.nextLine();
		userview.askPassword();
		password=input.nextLine();
		usermod=new Usermodel(username,password);
		loaduserFile();
	}	
	public void loaduserFile()
	{
		
		String file="./com/lxisoft/culturalevaluation/database/doc.txt";
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line,username1,password1;
			username1=usermod.getUsername();
			password1=usermod.getPassword();
			while((line=br.readLine())!=null)
			{
				String up[]=line.split(";");  
				
				if((username1.equals(up[0]))&&(password1.equals(up[1])))
				{
					userview.loginSuccess();
		
				}	
			}
			
			
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
}