package com.lxisoft;
import java.util.*;  
import java.lang.*;
import java.io.*;

class Test
{  
 public static void main(String args[])
 {  
   TreeMap treemap=new TreeMap();    
      treemap.put(100,"Amit");    
      treemap.put(102,"Ravi");    
      treemap.put(101,"Vijay");    
      treemap.put(103,"Rahul");    
        
      System.out.println(treemap);
    /*  for(Map.Entry<Integer,String> m:map.entrySet())
      {    
       System.out.println(m.getKey()+" "+m.getValue());    
      }*/    
 }  
}  