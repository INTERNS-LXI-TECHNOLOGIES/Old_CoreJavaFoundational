import java.util.*;
public class Student
{
	public String name;
	public int rollno;
	Subject[] sub;
	public void scan()
	{
		int total=0;
		sub=new Subject[3];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			sub[i]=new Subject();
			sub[i].scan();
		}
	}

	public void print()
	{	
		for(int i=0;i<3;i++)
		{	
			sub[i].print();
        }
	}
}
		