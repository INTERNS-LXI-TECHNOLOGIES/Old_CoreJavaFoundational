package com.lxisoft.campus.college;
public class Person
{
 private String name;
 private  int idno;


 Person(String name,int id)
 {
	this.name=name;
	this.idno=id;
 }
 
 public void display()
 {
	 System.out.print(name+":");
	 System.out.println(idno);
	 

 }
}