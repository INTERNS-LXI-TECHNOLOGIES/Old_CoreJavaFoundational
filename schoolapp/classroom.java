import java.util.Scanner;
public class classroom
{
	int i;
	String std;
	teacher teach=new teacher();
	student stud[]=new student[4];
	
public void setdetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter standered");
	std=sc.nextLine();
	teach.setdetails();
	for(i=0;i<2;i++)
	{
		stud[i]=new student();
	    stud[i].setdetails();
	}
	
}
	public void printdetails()
{
	System.out.println("standerd is : "+std);
	teach.printdetails();
	for(i=0;i<2;i++)
	{
	stud[i].printdetails();
    }

}

	 
}