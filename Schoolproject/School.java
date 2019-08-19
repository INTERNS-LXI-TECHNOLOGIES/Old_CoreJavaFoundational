import java.util.Scanner;

public class School
{
 String name;
 String place;
 int clss;
 Scanner sc=new Scanner(System.in);
  
 Classroom cls[]=new Classroom[5];
 
   void setSchoolDetails()
	{
	System.out.println("Enter name of school:");
	name =sc.nextLine();

	System.out.println("Enter place:");
	place =sc.nextLine();

	System.out.println("classroomdetails");
	
	System.out.println("\n");

	System.out.println("enter no of classes");
	 clss=sc.nextInt();
	 
		for(int i=0;i<clss;i++)
		{
			cls[i]=new Classroom();
			cls[i].setClassroomDetails();
		}

    }

    void getSchoolDetails()
	{
		
		
		System.out.println("School name:  "+name);
		System.out.println("\n");
		System.out.println("Place:  "+place);

    for(int i=0;i<clss;i++)
	{
       cls[i].getClassroomDetails();
    }

}

}
