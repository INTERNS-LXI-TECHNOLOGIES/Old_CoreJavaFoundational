import java.util.Scanner;
public class Clas
{
String name;
Scanner scan= new Scanner(System.in);
	  
	  Student students=new Student();
	  
	 
	  public void setClasDetails(int i)
		{
			
		int j=1,s,h;
			System.out.println("enter the "+j+"class name");
			name=scan.next();
			System.out.println("enter the num of students in "+j+" class");
		   h=scan.nextInt();
		   j++;
			//students.setStudentDetails(i,h);
			students.setStudentDetails(h);
			
			
		}

}