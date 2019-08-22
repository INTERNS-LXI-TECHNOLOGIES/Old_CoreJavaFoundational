import java.util.Scanner;
public class Classroom
{
	String standard;
	Teacher teacher;
	Student[] students;
	Student[] rank;
	public void setDetails()
	{ 	
		int l;		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter standard");
		standard=sc.nextLine();		
		System.out.println("enter the number of students");		
		l=sc.nextInt();
		students=new Student[l];
		teacher=new Teacher();
		
		teacher.setDetails();
		for(int i=0;i<l;i++)
		{
			students[i]=new Student();
	    	students[i].setDetails();
		}
	}
	public void printDetails()
	{
		int l;
		l=students.length;
		System.out.println("standard is : "+standard);
		teacher.printDetails();
		for(int i=0;i<l;i++)
		{	
			students[i].printDetails();
		}
	}
	public void rankList()
	{
		Student[] temp;
		int n=students.length;		
		temp=new Student[n];
		rank=new Student[n];
		for(int i=0;i<n;i++)
		{
			temp[i]=students[i];
		}
		for(int i=0;i<n;i++)
		{	
			for(int j=0;j<n;j++)
			{		
				if(temp[i].totalMark>temp[j].totalMark)
				{
				rank[1]=temp[i];
				temp[i]=temp[j];
				temp[j]=rank[1];
				}
			}
		}	
		for(int i=0;i<n;i++)
			{
				rank[i]=temp[i];
			}

		for(int i=0;i<n;i++)
			{

				System.out.println(rank[i].studentName);				
				System.out.println(rank[i].totalMark);
			}		

	}	
    
}


