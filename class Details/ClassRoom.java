import java.util.Scanner;
public class ClassRoom
{
	  Scanner scan= new Scanner(System.in);
      String name;
      Student[] students=new Student[10];
	  int nOfStudent;
	  public void setClassDetails()
		{
			
			int j=1,s;
			System.out.println("enter the 1st class name");
			name=scan.next();
			
			System.out.println("enter the num of students in 1st class");
			nOfStudent=scan.nextInt();
			j++;
			
			
		    for(int t=0;t<nOfStudent;t++)
	          {
					students[t]=new Student();
					students[t].setStudentDetails(nOfStudent);
			  }
			  
		 
		}
         public void printClassDetails()
		{
			int h;
			  for(int i=0;i<nOfStudent;i++)
			  {
					students[i].printMarkDetails(i);
			  }
		}
}