import java.util.Scanner;
public class Classroom
{
	
	String number;
	Teacher teacher;
	Student student[];

 	


    void getDetails()
	{
		int n;
		Scanner word=new Scanner(System.in);
		
		System.out.println("enter the class nmber");
		number=word.nextLine();
		teacher =new Teacher();
		teacher.getDetails();
	
		System.out.println("entrer the students count");
		n=word.nextInt();
		student=new Student[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("enter student "+(i+1)+" details");
			student[i]=new Student();	
			student[i].setDetails();
		}
		
	
	}
	void printDetails()
	{

		

		System.out.println("class room number= "+number);
		teacher.printDetails();
		int n=student.length;
		
		for(int i=0; i<n; i++)
		{
			System.out.println(+(i+1)+"th student details");
			student[i].printDetails();
		}
		
	}

}