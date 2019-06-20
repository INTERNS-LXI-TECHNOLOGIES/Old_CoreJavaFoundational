import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;	
import java.io.IOException;
public class Department
{
	ArrayList <Teacher> teacherslist = new ArrayList<Teacher>();
	ArrayList <Student> studentslist = new ArrayList<Student>();
	BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    Teacher t = new Teacher();
    Scanner in = new Scanner (System.in);
	public void readDptmnt()
	{   int i;
		String b[] = new String[10];
		System.out.println("Enter the number of department:");
		int a=in.nextInt();
		 for (i=1;i<=a;i++) 
		  {
			  System.out.println("Enter the Department"+i+":");
			  try
			   {
			      b[i]=input.readLine();
			     
			   }
			  catch(IOException e)
		       {}
		       readTeacher(b[i]);
		       readStudent(b[i]);
		  }
		
	}
	public void readTeacher(String dept)
	{			  int d,j;
			      String c;
	  			  System.out.println("enter the number of the teacher:");
			 	  d=in.nextInt();
			    	for (j=1;j<=d;j++) 
			    	{
			   	 		Teacher t1 = new Teacher();
			   	 		try
			   	 		{
			    		 System.out.println("Enter the name of the Teacher "+j+":");
			   			 c=input.readLine();
			    		 t1.setName(c);
			    		 t1.setDepartment(dept);
			    		 teacherslist.add(t1);
			   		    }
			   		    catch(IOException e)
		   				  {}
		   				   
		   			}	  
    }
    public void readStudent(String dept)
    {   int e,k;
    	String f;
    	System.out.println("Enter the number of students:");
    	e=in.nextInt();
    	for (k=1;k<=e;k++) 
    	{
    		Student s1 = new Student();
    			try
    			   {
	     			System.out.println("Name of the student:");
	     			f=input.readLine();
	  			    s1.setName(f);
	  			    s1.setDepartment(dept);
	  			     studentslist.add(s1);
    	           }
    	           catch(IOException ex)
		   	         {}
    	}
    }


}


	/*	
		displayDetails();
	}
		public void displayDetails()
		 {
			Student s1=new Student();
			System.out.println("Name="+s1.getName()+"Id ="+s1.getId());
		 }
		

}*/