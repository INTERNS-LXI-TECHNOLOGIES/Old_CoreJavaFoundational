package com.lxisoft.inheritance.student;
import java.util.*;
import com.lxisoft.inheritance.student.Csestudent;
import com.lxisoft.inheritance.student.Mechstudent;
public class Student
{
 private String studentName;
 private int admnNo;
public void setName(String studentName)
{
	this.studentName=studentName;
}
public void setAdmn(int admnNo)
{
	this.admnNo=admnNo;
}
public String getName()
{
	return studentName;
}
public int getAdmn()
{
	return admnNo;
}


}
