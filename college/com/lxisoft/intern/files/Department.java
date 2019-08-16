package com.lxisoft.intern.files;
import java.util.*;
import java.io.IOException;
public class Department
{   String name;
	ArrayList <Teacher> teacherslist = new ArrayList<Teacher>();
	ArrayList <Student> studentslist = new ArrayList<Student>();
    ArrayList <Lab> lablist = new ArrayList<Lab>();
    static Scanner in = new Scanner (System.in);
    public Department(String name){
    	this.name=name;
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
    public void createStudents()
    {   
        System.out.println("Ente the number of students:");
        int a=in.nextInt();
        for (int i=1;i<=a;i++) 
          {
            Student s1 = new Student();
    	    s1.readStudent();
    	    studentslist.add(s1);
          }    
    }
    public void createLab()
    {
        System.out.println("enter the number of lab :");
        int a=in.nextInt();
        for (int i=1;i<=a;i++) 
        {
            Lab l=new Lab();
            l.readLab();
            lablist.add(l);
        }
    }
    public void departmentDetails()
    {   System.out.println("DEPARTMENT NAME:"+name);
    	for (int j=0;j<teacherslist.size();j++){
            System.out.println(" Teacher "+(j+1)+" Details");
    		teacherslist.get(j).displayTeacher();
    	}
    	for (int k=0;k<studentslist.size();k++) {
            System.out.println(" Student "+(k+1)+" Details");
    		studentslist.get(k).displayStudent();
    	}
        for (int l=0;l<lablist.size();l++) {
            System.out.println("lab "+(l+1)+"details");
            lablist.get(l).displayLab();
        }
    }

}
