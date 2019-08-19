import java.util.Scanner; 

public class School

{
	String schoolname;
	String place;
	int n,i;
	Classroom classes[]=new Classroom[5];

	public void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the school name ");
		schoolname=sc.nextLine();
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
	System.out.println(" name of the school is "+schoolname);
	System.out.println("situated in "+place);
	for(i=0;i<n;i++)
		{
			classes[i].print();
		}
}

}