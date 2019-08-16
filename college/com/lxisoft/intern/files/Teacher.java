package com.lxisoft.intern.files;
import java.util.*;
import java.io.*;
public class Teacher extends Staff
{  
    static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    static Scanner in = new Scanner (System.in);
	  String sub;
   	public void readTeacher()
   	 { 
      try{
      createStaff();  
      System.out.println("Subject:");
      sub = input.readLine();}catch(IOException e){}
     }
    
    public void displayTeacher()
    {
    	displayStaff();
    }
}