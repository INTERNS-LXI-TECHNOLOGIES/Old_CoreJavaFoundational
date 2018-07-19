import java.util.*;
class ClassName{
	String name;
	Faculity f;
	Student[] s;


	public ClassName(String name){
		Scanner sc=new Scanner(System.in);
		String[] names = new String[10];
		String faculityName;
		System.out.println("Enter the name of Faculity:");
		faculityName=sc.nextLine();

		f=new Faculity(faculityName);
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the name of student:");
			names[i]=sc.nextLine();
		}
		
		int[] rollno = new int[10];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the rollno number:");
			rollno[i]=sc.nextInt();
			sc.nextLine();
		}
		this.name=name;
		
		s=new Student[2];
		for(int i=0;i<2;i++)
		{

			s[i]=new Student(names[i],rollno[i]);
		}

	}

	public void printDetails(){
		System.out.println("Class:"+name);
		f.printDetailsss();
		for(int i=0;i<2;i++)
		{ 
			
			s[i].printDetailss();
		}

	}


}