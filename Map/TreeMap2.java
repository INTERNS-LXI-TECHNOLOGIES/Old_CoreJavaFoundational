import java.util.*;  
public class TreeMap2
{  
  public static void main(String args[]) 
  {  
    TreeMap<String,String> map=new TreeMap<String,String>();    
      map.put("Z","Amit");    
      map.put("A","Ravi");    
      map.put("L","Vijay");    
      map.put("C","Rahul");    
       System.out.println(map); 
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      map.remove("A");  
      System.out.println("Descending Order");
      System.out.println(map.descendingMap());
      for(Map.Entry m:map.entrySet())
      {
          System.out.println(m.getKey()+","+m.getValue());
      }

      
      // System.out.println("After remove(A) method");  
      // for(Map.Entry m:map.entrySet())  
      // {  
      //     System.out.println(m.getKey()+" "+m.getValue());      
      // }  
      }  
}  