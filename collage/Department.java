import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;	
import java.io.IOException;
public class Department
{   String name;
	ArrayList <Teacher> teacherslist = new ArrayList<Teacher>();
	ArrayList <Student> studentslist = new ArrayList<Student>();
	static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    static Scanner in = new Scanner (System.in);
    public Department(String name){
    	this.name=name;
    }
    public void createStudents()
    {   System.out.println("Ente the number of students:");
        int a=in.nextInt();
        for (int i=1;i<=a;i++) {
           Student s1 = new Student();
    	   s1.readStudent();
    	   studentslist.add(s1);
          }    
    }
    public void createTeachers()
    {   System.out.println("enter the number of the Teacher:");
        int a=in.nextInt();
        for (int i=1;i<=a;i++)
         {
    	   Teacher t1 = new Teacher();
    	   t1.readTeacher();
    	   teacherslist.add(t1);
         }   
    }
    public void departmentDetails()
    {   System.out.println("DEPARTMENT NAME:"+name);
    	for (int j=1;j<=teacherslist.size();j++){
            System.out.println(" Teacher "+j+" Deatails");
    		teacherslist.get(j).displayTeacher();
    	}
    	for (int k=1;k<=studentslist.size();k++) {
            System.out.println(" Student "+k+" Deatails");
    		studentslist.get(k).displayStudent();
    	}
    }

}
