package com.lxisoft.intern.files;
import java.util.*;
import java.io.*;
public class Student
 {
	String name;
	int id;
  static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
  static Scanner in = new Scanner (System.in);
   public void readStudent()
   {       try{ System.out.println("enter the name of the student :");
           name=input.readLine();
           System.out.println("enter the ID of the student:");
           id=in.nextInt();}
           catch(IOException e){}
   }
  public void displayStudent()
   {
    System.out.println("name:"+name+"\nID:"+id);
   }
}