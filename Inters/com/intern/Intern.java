package com.intern;
import java.util.*;
   public class Intern
   {
   	private int id;
    private String name;
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


    public String toString() 
    {
        return "Intern{" +
                "id=" + id +
                ", name=" + name + '\'' +
                '}';
    }
}