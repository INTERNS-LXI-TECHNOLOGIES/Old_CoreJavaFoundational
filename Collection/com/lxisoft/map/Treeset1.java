package com.lxisoft.collection;
import java.util.*;  
class TreeSet1
{  
 public static void main(String args[])
 {  
  //Creating and adding elements  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay"); 
  al.add("Anu");
  al.add("Balu");
  al.add("Aami"); 
  //Traversing elements  
 /* Iterator<String> itr=al.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  */
  System.out.println("Initial Set: "+al);  
           
         System.out.println("Reverse Set: "+al.descendingSet());  
           
         System.out.println("Head Set: "+al.headSet("Balu", true));  
          
         System.out.println("SubSet: "+al.subSet("Aami", false, "Balu", true));  
           
         System.out.println("TailSet: "+al.tailSet("Ravi", true)); 
 }  
}  