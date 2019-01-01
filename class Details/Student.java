import java.util.Scanner;
public class Student
{ 
Scanner scan=new Scanner(System.in);
String name;
float mark1,mark2,mark3;

    
    float []  sum=new float[10];
    
	
	public void setStudentDetails(int h)
	{
	  String student;
	 
	for(int t=1;t<=h;t++)
	{
	    System.out.println("enter the 3 subjects mark in "+t+"student");
	    mark1=scan.nextFloat();
	    mark2=scan.nextFloat();
	    mark3=scan.nextFloat();
		sum[t]=mark1+mark2+mark3;
		
	}
	    for(int j=1;j<=h;j++)
		{
			
			System.out.println("sum of student" +j+"="+sum[j]);
			float total=3*100;
			float percentage=(sum[j]/total)*100;
			System.out.println("percentage="+percentage);
	    }
    }
	
	
	
}	