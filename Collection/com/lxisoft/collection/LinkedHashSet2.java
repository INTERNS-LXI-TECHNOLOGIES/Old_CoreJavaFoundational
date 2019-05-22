package com.lxisoft.collection;
import java.util.*;  
class LinkedHashSet2{  
 public static void main(String args[]){  
  LinkedHashSet<String> al=new LinkedHashSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay"); 
  al.add("Manu");
  al.add("Manu"); 
  System.out.println(al);
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  