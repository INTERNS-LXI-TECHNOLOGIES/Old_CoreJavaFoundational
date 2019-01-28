import java.util.Scanner;
public class Student
{ 
Scanner scan=new Scanner(System.in);
String name;
int mark1,mark2,mark3,registerNumber;
float total;    

	public void setStudentDetails(int h)
	{
	  
	  String student;
	  System.out.println("enter the name of the student");
	  name=scan.next();
	  System.out.println("enter the register number of the student");
	  registerNumber=scan.nextInt();
	  System.out.println("enter the 3 subjects mark in the  student");
				 mark1=scan.nextInt();
				 mark2=scan.nextInt();
				 mark3=scan.nextInt();
				 total=mark1+mark2+mark3;		
			
	    
    }
	public void printMarkDetails(int i)
	{
		    i++;
			System.out.println("        ");
			System.out.println("        ");
		   System.out.println("STUDENT "+i+"DETAILS");
		  System.out.println("***************");
			System.out.println("name of the student="+name);
			System.out.println("register number ofthe students="+registerNumber);
			float outof=3*100;
			float percentage=(total/outof)*100;
			System.out.println("percentage="+percentage);
			System.out.println("        ");
			System.out.println("        ");
			
	}
	
	
	
}	