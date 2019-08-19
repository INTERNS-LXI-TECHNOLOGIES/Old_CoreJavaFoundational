import java.util.Scanner;

public class School
{
 String name;
 String place;
 Scanner sc=new Scanner(System.in);
  // Classroom class1;
 	 Classroom class1=new Classroom();

  // Classroom class2;
 		 Classroom class2=new Classroom();
 
void setSchoolDetails()
	{
	System.out.println("Enter name of school:");
	name =sc.nextLine();

	System.out.println("Enter place:");
	place =sc.nextLine();
System.out.print("classroomdetails");
	class1.setClassroomDetails();
	System.out.println("\n");
 class2.setClassroomDetails();
    }


    void getSchoolDetails()
	{
		System.out.println("School name:  "+name);
		System.out.println("\n");
		System.out.println("Place:  "+place);



class1.getClassroomDetails();
 class2.getClassroomDetails();
}
}
