import java.util.*;
public class Classroom
{
	String classDivision;
	String classTeacher;
	int classStrength;
	Student[] stud;
	int number,j,i;

	public void setDetails()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("How Many Student in The Class");
		number=in.nextInt();
		stud=new Student[number];

		for(i=0;i<number;i++){

			Student student= new Student();
			stud[i]=student;
		    System.out.print("Enter The Division Of The Student"+(i+1)+":");
			stud[i].divisionStd=in.next();
			System.out.print("\nEnter The Name Of The Student"+(i+1)+":");
			stud[i].name=in.next();
			System.out.print("\nEnter The Roll Number Of The Student "+(i+1)+":");
			stud[i].rollNumber=in.nextInt();
			for(j=0;j<3;j++)
			   {
			   	System.out.print("Enter The Mark Of Subject "+(j+1)+":");
			   	stud[i].mark[j]=in.nextInt();
			   }
			}
		}

	
	public void getDetails()
	{
		System.out.print("\n-------------------------------");
		System.out.print("\nDETAILS OF THE STUDENT");
		System.out.print("\n--------------------------------");
		for(i=0;i<number;i++)
		{
		System.out.print("\nDivision of the Student :"+stud[i].divisionStd+
			             "\nName of the Student :"+stud[i].name+
		                 "\nThe Roll Number of the Student :"+stud[i].rollNumber);
		for(j=0;j<3;j++)
		{
			System.out.print("\n The Mark Of Subject "+(j+1)+":"+stud[i].mark[j]);
		   
		   	stud[i].total=stud[i].total+stud[i].mark[j];
		}
		System.out.print("\n Total Mark :"+stud[i].total);
	     }
	}	


}