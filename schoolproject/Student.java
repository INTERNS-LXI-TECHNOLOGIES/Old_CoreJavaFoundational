import java.util.Scanner;
public class Student
{
	int rollno;
	String name;
    Subject[] subject;
    int total;
	void setStudentDetails()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter roll no:	");
	rollno=sc.nextInt();
	System.out.println("Enter name: ");
	name=sc.next();
	System.out.println("Details of Subject");
	System.out.println("Enter no.of subjects");
	int n=sc.nextInt();
	subject=new Subject[n];
		for(int i=0;i<n;i++)
			{
			   subject[i]=new Subject();
			   subject[i].setSubDetails();
	        }
    }
	void getStudentDetails()
	{   
		total=0;
		System.out.println("Rollno:	"+rollno);
		System.out.println("Name:	"+name);
		for(int i=0;i<subject.length;i++)
		   {
		    subject[i].getSubDetails();	
		    total=total+subject[i].mark;
		   }
		   System.out.println("Total :" +total);
		   System.out.println("\n");
	}
}