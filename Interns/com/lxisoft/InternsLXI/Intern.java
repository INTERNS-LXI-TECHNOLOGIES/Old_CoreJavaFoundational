package com.lxisoft.InternsLXI;	
public class Intern{

	String name;
	String qualification;
	int age;

public Intern(String name,String qualification,int age){

	this.name=name;
	this.qualification=qualification;
	this.age=age;

}
public boolean equals(Object I) {

    return (this.name).equals(((Intern)I).name);
}
public int hashCode(){

	return name.hashCode();
}
   
public String toString(){

    return name + ", " +qualification+", " +age;
}

}