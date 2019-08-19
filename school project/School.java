import java.util.Scanner;
public class School
{
	Scanner word=new Scanner(System.in);
String name;
 int n;
 Classroom classroom[]=new Classroom[10];
// Classroom classroom1;
// Classroom classroom2;
	
	// Classroom classroom1=new Classroom();
	// Classroom classroom2=new Classroom();
	public  void getDetails()
	{


	System.out.println("enter the school name");
	name=word.nextLine();

	System.out.println("enter the no of classrooms");
	n=word.nextInt();
	for(int i=0; i<n; i++){
	classroom[i]=new Classroom();
	classroom[i].getDetails();}
	

	}
	public void printDetails()
	{
		System.out.println("School name = "+name);
		for(int i=0; i<n; i++)classroom[i].printDetails();
		
	}
}
