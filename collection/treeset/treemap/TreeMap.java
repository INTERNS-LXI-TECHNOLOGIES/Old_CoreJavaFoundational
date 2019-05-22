import java.util.*;
public class TreeMap
{
	 public static void main(String[]args) 
	 {
	 	
      TreeMap<String, String> tmap = new TreeMap<String, String>();

      tmap.put(1200, "redmi");
      tmap.put(21000, "samsung");
      tmap.put(10000, "Letv");
      tmap.put(4900, "Lenovo");
      tmap.put(8000, "Oppo");

      Set set = tmap.entrySet();
      System.out.println("the set is :"+tmap.entrySet());
      Iterator iterator = set.iterator();
      while(iterator.hasNext())
       {
         Map.Entry m = (Map.Entry)iterator.next();
         System.out.print("\nkey is: "+ m.getKey() + " & Value is: "+m.getValue());
       }



      String v= tmap.get(1200);
      System.out.println("\nValue at index  is: "+v);
      tmap.remove(10000);
      System.out.println("\nkey values after remove is:");
      Set set1 = tmap.entrySet();
      Iterator i = set1.iterator();
      while(i.hasNext()) 
      {
          Map.Entry m1 = (Map.Entry)i.next();
          System.out.print("Key is: "+m1.getKey() + " & Value is: ");
          System.out.println(m1.getValue());
       }

   }
}
	 
