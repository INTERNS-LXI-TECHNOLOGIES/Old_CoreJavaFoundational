import java.util.Scanner;
public class Classroom
{
	String standard;
	Teacher teach;
	Student[] stud;
	public void setDetails()
	{ 	
		int l;		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter standard");
		standard=sc.nextLine();		
		System.out.println("enter the number of students");		
		l=sc.nextInt();
		stud=new Student[l];
		teach=new Teacher();
		
		teach.setDetails();
		for(int i=0;i<l;i++)
		{
			stud[i]=new Student();
	    		stud[i].setDetails();
		}
	}
	public void printDetails()
	{
		int l;
		l=stud.length;
		System.out.println("standard is : "+standard);
		teach.printDetails();
		for(int i=0;i<l;i++)
		{	
			stud[i].printDetails();
		}
	}
}

