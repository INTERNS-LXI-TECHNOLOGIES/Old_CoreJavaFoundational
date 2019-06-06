package com.lxisoft.InternsLXI;	
public class Intern implements Comparable<Intern>{

	String name;
	String qualification;
	int age;

public Intern(String name){

	this.name=name;
	// this.qualification=qualification;
	// this.age=age;

}
public boolean equals(Object I) {

    return (this.name).equals(((Intern)I).name);
}
public int compareTo(Intern intern){
	return name.compareTo(intern.name);
}
public int hashCode(){

	return name.hashCode();
}
   
public String toString(){
	return name;
    // return name + ", " +qualification+", " +age;
}

}