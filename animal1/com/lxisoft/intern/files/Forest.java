package com.lxisoft.intern.files;
import java.util.*;
import java.io.*;
public class Forest
{ 
	ArrayList <Animal> animalslist = new ArrayList <Animal>();
	
	public void createAnimals()
	{
	     Animal d = new Deer("Deer",5);
       	     Animal t = new Tiger("Tiger",7);
     	     Animal l = new Lion("Lion",9);
    	     Animal r = new Rabbit("Rabbit",2);
    	     animalslist.add(d);
       	     animalslist.add(t);
             animalslist.add(l);
             animalslist.add(r);
          if(l instanceof Lion)	
   	     System.out.println("l is instance of Lion");
	  else
             System.out.println("l is not instance of lion");
        } 
  public void fight()
{
   for (Animal a : animalslist)
     { 
        System.out.println("Animal name:"+a.name+"         Power:"+a.power);
           
         /* if(a.power>n)
            {System.out.println("true");}
          else
            {System.out.println("false");}*/


     }
   /* for (int i=0;i<animalslist.size();i++)
    
  {   System.out.println(animalslist.get(i).name+"power:" +animalslist.get(i).power); 
      if(animalslist.get(i).power>animalslist.get(i+1).power)
       
          {System.out.println(animalslist.get(i).name+"wins");}
       	
     else
		  {System.out.println("Tiger wins");}
   }*/
}
     public void display()
     { 
       for (int i=0;i<animalslist.size();i++)
         {
          System.out.println("Names of Animal :"+animalslist.get(i).name);
          System.out.println("\nPower           :"+animalslist.get(i).power);
         }
      }  
}















/*

if ((a >= b) && (a >= c) && (a >= d) && (a >= e)) { 
    System.out.println ("Largest is: " + a);
} else if ((b >= c) && (b >= d) && (b >= e)) {      
    System.out.println ("Largest is: " + b);
} else if ((c >= d) && (c >= e)) {                  
    System.out.println ("Largest is: " + c);
} else if (d >= e) {                                
    System.out.println ("Largest is: " + d);
} else {                                            
    System.out.println ("Largest is: " + e);
}*/
