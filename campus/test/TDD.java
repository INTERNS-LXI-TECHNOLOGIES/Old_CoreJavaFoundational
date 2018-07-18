package com.lxisoft.campus.test;
import com.lxisoft.campus.Student;
import com.lxisoft.campus.cse.Cse;
import com.lxisoft.campus.eee.Eee;
public class TDD
{
	public static void main(String args[])
	{
		System.out.println("COLLEGE WAS CREATED!!");
		Student s=new Student();
		Cse c=new Cse();
		Eee e=new Eee();
		s.pip();
		s.setname1("Varsha");
		String a=s.getname1();
		System.out.println(a);
		c.display();
		c.say1();
		
		
		
		s.setname2("Aysha");
		String r=s.getname2();
		System.out.println(r);
		e.print();
		e.say2();
	}
}