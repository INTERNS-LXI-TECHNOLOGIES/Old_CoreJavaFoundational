import java.util.*;
public class Staffroom
{
	String staffHead;
	int noStaff;
	Teacher[] tea;
	public void setDetails()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter The No.of Teachers :");
		int number=in.nextInt();
		noStaff = number;
		tea = new Teacher[number];
		for(int i=0;i<number;i++)
		{
			tea[i]=new Teacher();
		    System.out.print("\n Enter The Name Of The Teacher"+(i+1)+":");
		    tea[i].name=in.next();
		    System.out.print("\n Enter The Name Of the Subject"+(i+1)+":"+" ");
		    tea[i].subjectName=in.next();
		    System.out.print("\n Enter The Joining Year Of The Teacher"+(i+1)+":"+" ");
		    tea[i].joiningYear=in.nextInt();
		}

	}
public void getDetails()
{
	System.out.print("\n-------------------------------");
	System.out.print(" \n DETAILS OD THE TEACHERS ");
	System.out.print("\n-------------------------------");
	System.out.print("\nNo.of Teachers In The Staff Room :"+noStaff);
	for(int i=0;i<noStaff;i++)
	{
		System.out.print("\nTeacher Name "+(i+1)+":"+tea[i].name+
			             "\nSubject Name "+(i+1)+":"+tea[i].subjectName+
			             "\n Joining Year"+(i+1)+":"+tea[i].joiningYear);
	}
}
}