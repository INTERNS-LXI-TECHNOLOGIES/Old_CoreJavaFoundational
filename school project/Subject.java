import java.util.*;
public class Subject
{	
	public String name;
	public int mark;
	public void scan()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name of the subject : ");
		name=s.next();
		System.out.println("Enter mark : ");
		mark=s.nextInt();
	}	
	public void print()
	{
		System.out.println("\n\tSubject name : "+name+"\t\tMark : "+mark);
	
    } 
}	