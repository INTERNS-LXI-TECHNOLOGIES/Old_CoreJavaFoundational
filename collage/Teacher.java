import java.util.*;
import java.io.*;
public class Teacher
{   static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    static Scanner in = new Scanner (System.in);
	String name;
   	public void readTeacher()
   	{   try{
   			System.out.println("enter the name of the Teacher :");
   			this.name=input.readLine();}
   			catch(IOException e){
   				e.printStackTrace();
   			}
    }
    public void displayTeacher()
    {
    	System.out.println("Teacher name:"+name);
    }
}
