package com.lxisoft.inheritance.test;
import com.lxisoft.inheritance.student.Student;
import com.lxisoft.inheritance.student.cse.Cse;
import com.lxisoft.inheritance.student.mech.Mech;
class TDD
{

public static void main(String args[])
{
Student s=new Student();
Cse c;
//Cse c=new Cse();
Mech m=new Mech();

m.setname("manoj");
m.setaddress("palakkad");
String v=m.getname();
String a=m.getaddress();
System.out.println(v);
System.out.println(a);
}
}