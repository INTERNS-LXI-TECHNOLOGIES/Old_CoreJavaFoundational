package com.lxisoft.intern.files;
import java.util.*;
import java.io.*;
import java.util.Random;
public class Forest
{ 
	ArrayList <Animal> animalslist = new ArrayList <Animal>();
	public void createAnimals()
	{   
	     
	     Random rand = new Random();              
	     int random1 = rand.nextInt(60); 
	     int random2 = rand.nextInt(90); 
	     int random3 = rand.nextInt(100); 
             int random4 = rand.nextInt(30); 
             int random
	     Animal d = new Deer("Deer",random1);
       	     Animal t = new Tiger("Tiger",random2);
     	     Animal l = new Lion("Lion",random3);
    	     Animal r = new Rabbit("Rabbit",random4);
    	     animalslist.add(d);
       	     animalslist.add(t);
             animalslist.add(l);
             animalslist.add(r);
	
        } 
     public void display()
         { 
          for (int i=0;i<animalslist.size();i++)
            {
             System.out.println("Names of Animal :"+animalslist.get(i).name);
             System.out.println("Power           :"+animalslist.get(i).power);
            }
         } 
    public void fight()
          {
              for (int i=0;i<(animalslist.size()-1);i+=2)
                 {
                     System.out.println(animalslist.get(i).name+" fight with " +animalslist.get(i+1).name); 
		        if(animalslist.get(i).power >= animalslist.get(i+1).power)
		            System.out.println(animalslist.get(i).name+" wins ");
		        else
		            System.out.println(animalslist.get(i+1).name+" wins ");
		
                  }
          }

}

    





/*   if((animalslist.get(0).power >= animalslist.get(1).power) & (animalslist.get(0).power >= animalslist.get(2).power) & (animalslist.get(0).power >= animalslist.get(3).power)) 
	    {   System.out.println ("Deer wins"); }
	
               else if ((animalslist.get(1).power >= animalslist.get(2).power) && (animalslist.get(1).power >= animalslist.get(3).power))       
                 {  System.out.println ("Tiger wins"); }
	       else if ((animalslist.get(2).power >= animalslist.get(3).power)) 
		 {  System.out.println ("Lion wins");  }
         else {  System.out.println ("Rabbit wins");} */


