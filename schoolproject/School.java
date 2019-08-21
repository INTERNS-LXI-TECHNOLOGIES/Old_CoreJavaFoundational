import java.util.Scanner;
public class School
{
 String name;
 String place;
 Classroom[] classes;
 
 
   void setSchoolDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of school:");
		name =sc.nextLine();
		System.out.println("Enter place:");
		place =sc.nextLine();
		System.out.println("\n ");
		System.out.println("classroomdetails");
		System.out.println("\n");
		System.out.println("enter no of classes");
		int n=sc.nextInt();

		classes=new Classroom[n];
		for(int i=0;i<n;i++)
		{ 
			System.out.println("\nenter "+(i+1)+" th classroom details");
			classes[i]=new Classroom();
			classes[i].setClassroomDetails();
		}
    }

    void getSchoolDetails()
	{
		System.out.println("\n");
		int n=classes.length;
		System.out.println(name);
		System.out.println("Situated in "+place);
		System.out.println("---------------------");
	    for(int i=0;i<n;i++)
		{
	       classes[i].getClassroomDetails();
	       System.out.println("Rank List");
	       classes[i].rankList();
	    }

    }

}
