package com.lxisoft.intern.main;
import com.lxisoft.intern.files.College;
import com.lxisoft.intern.files.Department;
import com.lxisoft.intern.files.Lab;
import com.lxisoft.intern.files.NonTeaching;
import com.lxisoft.intern.files.Staff;
import com.lxisoft.intern.files.Student;
import com.lxisoft.intern.files.Teacher;
public class Tdd
{
  public static void main(String[] arg)
   {
	College c = new College("SNM","NORTH PARAVOOR");
		c.createDeprtments();
	    c.displayDetails();
   }

}