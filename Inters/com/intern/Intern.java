package com.intern;
import java.util.*;
   public class Intern
   {
   	private String id;
    private String name;
   public  Intern(String id, String name)
    {
        this.id = id;
        this.name = name;
    }


 	public void setId(String id)
     {
        this.id = id;
    }

    public String getId()
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