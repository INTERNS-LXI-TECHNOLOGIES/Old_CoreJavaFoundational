import java.util.Scanner;
public class Tdd
{
	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("how many records do you want to entry");
		int r=scan.nextInt();
			
		Student[] students=new Student[r];
			int i;
			
			for(i=0;i<r;i++)
			{
				students[i]=new Student();
			}
			
			for(i=0;i<r;i++)
			{
				students[i].setStudentDetails(i);
			}
System.out.println("how many subjects do you want to entry");			
	      int sub=scan.nextInt();
		 for(i=0;i<r;i++)
			{
			 students[i].setSubAndMark(sub,i);
			}
			
		
		for(i=0;i<r;i++)
			{
			students[i].printStudentDetails();
			}		  
	}
}