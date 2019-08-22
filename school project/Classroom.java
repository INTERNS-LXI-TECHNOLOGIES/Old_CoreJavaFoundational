import java.util.*;
public class Classroom
 {
	public int std;
	public String div;
	public Student[] s1;
	public Teacher t;
	public void scan() 
	{
		t=new Teacher();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter STD : ");
		std=s.nextInt();
		System.out.println("Enter DIV : ");
		div=s.next();
		t.scan();
		System.out.println("Enter the number of students : ");
		int ln=s.nextInt();
		s1=new Student[ln];
		for(int i=0;i<ln;i++)
			{
			s1[i]=new Student();
			System.out.println("Enter name of the student : ");
			s1[i].name=s.next();
			System.out.println("Enter the RollNo : ");
			s1[i].rollno=s.nextInt();
			s1[i].scan();
		}
	}	
		public void print()
		{
			System.out.println("STD : "+std+"\t\tDIV : "+div);
			t.print();
			for(int i=0;i<s1.length;i++)
			{
				System.out.println("\t\n "+s1[i].name+"--"+s1[i].rollno);
				s1[i].print();
			}
		}	
	
		
	}
	