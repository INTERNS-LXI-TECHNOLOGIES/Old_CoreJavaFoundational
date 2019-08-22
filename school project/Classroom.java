import java.util.Scanner;
public class Classroom
{
	
	String number;
	Teacher teacher;
	Student[] student;
	
	
    void getDetails()
	{
		int n;
		Scanner word=new Scanner(System.in);
		
		System.out.println("enter the class nmber");
		number=word.nextLine();
		teacher =new Teacher();
		teacher.getDetails();
	
		System.out.println("entrer the students count");
		n=word.nextInt();
		student=new Student[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("enter student "+(i+1)+" details");
			student[i]=new Student();	
			student[i].setDetails();
		}
		
	
	}
	void printDetails()
	{

		

		System.out.println("class room number= "+number);
		teacher.printDetails();
		int n=student.length;
		
		for(int i=0; i<n; i++)
		{
			System.out.println(+(i+1)+"th student details");
			student[i].printDetails();
		}
		
	}
	void rankList()
	{
		
		int n=student.length;
		Student[] rank=new Student[5];
		Student temp;
		for(int i=0; i<n; i++)
		{
			rank[i]=new Student();
			rank[i]=student[i];
		}

		for(int i=0; i<n; i++)
		{
			temp=new Student();
			for(int j=0; j<n; j++)
			{
				if(rank[i].tmark>rank[j].tmark)
				{
					temp=rank[i];
					rank[i]=rank[j];
					rank[j]=temp;

				}
			}
		}
		// for(int i=0; i<n; i++)
		// {
		// 	rank[temp[i];
		// }

	
		for(int i=0; i<n; i++)
		{
			System.out.println(rank[i].studentName);
			System.out.println(rank[i].tmark);

		}
	}

}