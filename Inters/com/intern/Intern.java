package com.intern;
import java.util.*;
import java.util.Collections;
   public class Intern
   {
    int id;
    String name;
   public  Intern(int id, String name)
    {
        this.id = id;
        this.name = name;
    }


 	public void setId(int id)
     {
        this.id = id;
    }

    public int getId()
     {
        return id;
    }
    public void setName(String name)
     {
        this.name = name;
    }
    public String getName() 
    {
        return name;
    }
    public boolean equals(Object I) {

    return (this.name).equals(((Intern)I).name);
    }
    public int compareTo(Intern intern){
    	int hash=this.name.compareTo(intern.name);
    return hash;
    }


    public String toString() 
    {
        return "Intern{" +
                "id=" + id +
                ", name=" + name + '\'' +
                '}';
    }
}