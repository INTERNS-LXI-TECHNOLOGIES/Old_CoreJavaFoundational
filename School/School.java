import java.util.*;
public class School
{
	String schoolName;
	String acadamicYr;
	Classroom clas=new Classroom();
	Staffroom staff=new Staffroom();
	String headMaster;
	Student stud=new Student();
	public void setDetails()
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the Name Of The Shcool :");
		schoolName=in.next();
		System.out.print("\n Enter the Acadamic Year :");
		acadamicYr=in.next();
		System.out.print("\n Enter the Name of the Head Master :");
		headMaster=in.next();
		System.out.print("\nEnter The Division Of The Classroom :");
		clas.classDivision=in.next();
		System.out.print("\n Enter The Name Of The Class Teacher :");
		clas.classTeacher=in.next();
		System.out.print("\n Enter The Strength Of The Class :");
		clas.classStrength=in.nextInt();
		clas.setDetails();
		System.out.print("\n Enter The Name Of The Staff Head :");
		staff.staffHead=in.next();
		System.out.print("\n Enetr The No. Of Staff In The School :");
		staff.noStaff=in.nextInt();
		staff.setDetails();

	}

	public void getDetails()
	{
		System.out.print("\n-------------------------------");
		System.out.print("\nDETAILS OF THE SCHOOL ");
		System.out.print("\n-------------------------------");
		System.out.print("\n Name Of The School      :"+schoolName+
						 "\n Acadamic Year           :"+acadamicYr+
						 "\n Name Of The Head Master :"+headMaster);
		System.out.print("\n-------------------------------");
		System.out.print("\n DETAILS OF THE CLASS");
		System.out.print("\n-------------------------------");
		System.out.print("\nDivision of the Class       :"+clas.classDivision+
					     "\n Name of The Class Teacher  :"+clas.classTeacher+
			             "\nStrength of the Class       :"+clas.classStrength);
		clas.getDetails();
		System.out.print("\n-------------------------------");
		System.out.print("\n DETAILS OF THE STAFF ROOM ");
		System.out.print("\n-------------------------------");
		System.out.print("\nThe Head Of The Staff Is       :"+staff.staffHead+
			             "\n No.Of The Staff In The School :"+staff.noStaff);
		staff.getDetails();
		System.out.print("\n*************************************");



	}
}