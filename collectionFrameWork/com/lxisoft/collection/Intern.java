package com.lxisoft.collection;
public class Intern
{
	  String name;
	  int reg; 
	  //constructor
	  public Intern(String name,int reg)
	  {
		  this.name = name;
		  this.reg = reg;
	  }
	  public String toString()
	  {
		  return name+" "+reg;
	  }
	  //override in equals method
	  public boolean equals(Object obj)
	  {
		    if(((Intern)obj).name.equals(this.name)&&((Intern)obj).reg==this.reg)
	          {
				return true;
	          }
			return false;
	  }
	  
}