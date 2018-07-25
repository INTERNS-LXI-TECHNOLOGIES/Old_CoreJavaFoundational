package com.lxisoft.quiz.Quiz;

import com.lxisoft.quiz.User.*;
import com.lxisoft.quiz.clear.*;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class LoginController{
	public void Login(){
		int len,c1=0,count=0,current=0,agree=0;
		char st;
		String line,username,password,usernamecheck,passwordcheck,FILENAME1,username1="",password1="";
		Scanner sc = new Scanner (System.in);
		UserController uc = new UserController();
		LoginView lv = new LoginView();
		lv.askUsername();
		username = sc.nextLine();
		lv.askPassword();
		password = System.console().readLine();;
		LoginModel lm = new LoginModel(password,username,"D:/workspace/mvc/Files/credentials.txt");
		FILENAME1 = lm.getFilename();
		usernamecheck = lm.getUsername();
		passwordcheck = lm.getPassword();
		try{
		FileReader fr = new FileReader(FILENAME1);
		BufferedReader br = new BufferedReader(fr);
		while((line=br.readLine())!=null){
			len=line.length();
			do{
				while((st=line.charAt(c1))!='|'){
					username1+=st;
					c1++;
				}
				c1++;
				while(c1<len){
					st=line.charAt(c1);
					password1+=st;
					c1++;
				}
				if(usernamecheck.equals(username1) && passwordcheck.equals(password1)){
					count++;
				}	
			}while(false);
			if(count>0){
				current=count;
				count=0;
				password="";
				username="";
				break;
			}
			username1="";
			password1="";
			c1=0;
			
		}
		if(current>0){
			lv.succesdetails();
			agree = sc.nextInt();
			cls();
			if(agree==1){
			uc.user();}
			}
			else
			{
				lv.unsuccesdetails();
			}
		}catch(IOException e){
			e.printStackTrace();
		}	
		
	}
	public void controller(){
		String signupPassword,signupUsername;
		int choice;
		Scanner sc = new Scanner (System.in);
		LoginView lv = new LoginView();
		lv.interfaceView();
		choice = sc.nextInt();
		switch(choice){
			case 1: Login();
					break;
		    case 2: UserController uc = new UserController();
			        lv.askUsername();
		            signupUsername=System.console().readLine();
		            lv.askPassword();
		            signupPassword=System.console().readLine();
					uc.signup(signupUsername,signupPassword);break;
			case 3: System.exit(0);break;
		}
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