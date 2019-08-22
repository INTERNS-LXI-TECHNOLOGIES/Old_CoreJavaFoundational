import java.util.Scanner;
public class School
{
	
	String name;
 
 	Classroom classroom[];
	public  void getDetails()
	{
		Scanner word=new Scanner(System.in);
		int n;
		System.out.println("enter the school name");
		name=word.nextLine();

		System.out.println("enter the no of classrooms");
		n=word.nextInt();
		classroom=new Classroom[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("enter "+(i+1)+"th classroom details");
			
			classroom[i]=new Classroom();
			classroom[i].getDetails();
		}
	}
	public void printDetails()
	{
		int n=classroom.length;
		
		System.out.println("School name = "+name);
		for(int i=0; i<n; i++)
			{
				System.out.println(+(i+1)+"th classroom details");
				classroom[i].printDetails();
				System.out.print("class wise rank list :");
				classroom[i].rankList();
			}		
	}
}
