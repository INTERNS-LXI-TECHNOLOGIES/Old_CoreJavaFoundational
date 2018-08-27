package com.lxisoft.movieScript.registerdata;
import com.lxisoft.movieScript.registerdata.cast.*;
import com.lxisoft.movieScript.registerdata.crew.*;

public class RegisterData_controller{

Hero hero;
Comedian comedian;
Villain villain;
Heroine heroine;
Director director;
ScriptWriter scriptwriter;
Producer producer;
	public void setClass(String temp,int data)throws Exception
	{
		
		if(temp.equals("cast"))
		{
			switch(data)
			{
				case 1:
				hero=new Hero();
				break;
				case 2:
				heroine=new Heroine();
				break;
				case 3:
				comedian=new Comedian();
				break;
				case 4:
				villain=new Villain();
				break;
				
				
			}
		}
		else if(temp.equals("crew"))
		{
			switch(data)
			{
				case 1:
				director=new Director();
				break;
				case 2:
				scriptwriter=new ScriptWriter();
				break;
				case 3:
				producer=new Producer();
				break;
				
			}
		}
	}
	
}