package com.lxisoft.quize.Quize;
import com.lxisoft.quize.User.*;
import com.lxisoft.quize.clear.*;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Login{
	private static final String FILENAME1 = "D:/workspace/quizev1.0/Files/credentials.txt";
	String[] s=new String[20];
	String line,password1="",username1="",line1;
	int len,c1=0,count=0,current=0,agree;
	char st;
	public Login(String username,String password){
		User u = new User();
		Scanner sc = new Scanner(System.in);
		try{FileReader fr = new FileReader(FILENAME1);
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
				if(username.equals(username1) && password.equals(password1)){
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
			System.out.println("\n\nLOGIN SUCCESSFUL");
			System.out.println("\n\n");
			System.out.println("BEST OF LUCK. TAKE YOUR TEST SOUNDLY AND IN A BETTER MANNER");
			System.out.println("\n\n");
		    System.out.println("----------DESCRIPTION----------");
			System.out.println("\n");
			System.out.println("1. Do not indulge in any kind of malpractices, be genuine and serious while taking the test\n"+"2. Using calculators and other electronic gadgets are strictly prohibited"+ 
			                   ", if any one found being indulged,his/her Candidature will be cancelled\n"+"3. Talking while taking the test is prohibited\n"+"\n\n"+"GOOD LUCK");
			System.out.println("\n IF YOU AGREE WITH THESE CONDITIONS PLEASE PRESS [1]\n");
			agree = sc.nextInt();
			cls();
			if(agree==1){
			u.check();}
			}
		else
		{
			System.out.println("LOGIN UNSUCCESSFULL");
			System.out.println("\n\n");
			System.out.println("PLEASE RETRY...........  :|");
		}
	}catch(IOException e){
		  // System.out.println("//////");
			System.out.println("Error");	
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