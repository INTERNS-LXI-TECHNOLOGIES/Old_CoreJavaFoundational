package com.lxisoft.inheritance.test;
import com.lxisoft.inheritance.student.Student;
import com.lxisoft.inheritance.student.cse.Cse;
import com.lxisoft.inheritance.student.mech.Mech;
class TDD
{

public static void main(String args[])
{
Student s=new Student();
Cse c=new Cse();
Mech m=new Mech();

m.setname("Arthadh");
m.setaddress("palakkad");
c.setname("Manoj");
c.setaddress("palakkad");
String v=m.getname();
String a=m.getaddress();
String r=c.getaddress();
System.out.println(r);
System.out.println(v);
System.out.println(a);
}
}