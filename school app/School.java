import java.util.Scanner; 

public class School

{
	String schoolName;
	String place;
	Classroom classes[];

	public void scan()
	{
		int n,i;
		classes[]=new Classroom[5];
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the school name ");
		schoolName=sc.nextLine();
		System.out.println(" enter the school location ");
		place=sc.nextLine();

		System.out.println("enter the no. of classes");
		n=sc.nextInt();

			for(i=0;i<n;i++)
			{
				classes[i]=new Classroom();
				classes[i].scan();
			}

	}

	public void print()
	{
		int n,i;
		classes[]=new Classroom[5];
		System.out.println(" name of the school is "+schoolName);
		System.out.println("situated in "+place);
		
			for(i=0;i<n;i++)
			{
				classes[i].print();
			}
	}

}