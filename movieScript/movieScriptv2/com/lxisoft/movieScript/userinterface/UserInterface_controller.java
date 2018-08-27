package com.lxisoft.movieScript.userinterface;
import com.lxisoft.movieScript.dialoguemaker.*;
import com.lxisoft.movieScript.registerdata.*;
import com.lxisoft.movieScript.moviescripter.*;
import java.util.*;
import java.io.*;
public class UserInterface_controller
{
	public static int mainmenu;
	RegisterData_view cre; 
	MovieScripter_view scr; 
	DialogueMaker_view dia; 
	public void mainViewSelector()throws Exception
	{
		Scanner in=new Scanner(System.in);
		mainmenu=in.nextInt();
		switch(mainmenu)
		{
			case 1:
			cre=new RegisterData_view();
			break;
			case 2:
			dia=new DialogueMaker_view();
			break;
			case 3:
			scr=new MovieScripter_view();
			break;
			case 0:
			System.exit(0);
		}
		
	}
}