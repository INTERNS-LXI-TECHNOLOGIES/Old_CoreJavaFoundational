package com.lxisoft.intern.files;
import java.util.*;
import java.io.*;
public class College
{
	String name;
	String address;
    static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    static Scanner in = new Scanner(System.in);
    ArrayList <Department> departmentslist = new ArrayList<Department>();
    public College(String name,String address)
    {
        this.name = name;
        this.address = address;
    }
    public void createDeprtments()
    {   
        System.out.println("enter the number of the department");
        int a = in.nextInt();
        in.nextLine();
        String b=null;
        for (int i=1;i<=a;i++) {
            try{
            System.out.println("enter the name of the department "+i+":");             
            b=input.readLine();
               }catch(IOException e){}
            Department d =new Department(b);
            d.createTeachers();
            d.createStudents();
            d.createLab();
            departmentslist.add(d);

        }         
    }
    public void displayDetails()
    {
    	System.out.println("\t\t\t<<<<<  COLLEGE NAME :"+name+" >>>>>"+"\n"+"\t                    ADDRESS:"+address);
        for(int i=0;i<departmentslist.size();i++){
            departmentslist.get(i).departmentDetails();
        }
    }
  
 }   