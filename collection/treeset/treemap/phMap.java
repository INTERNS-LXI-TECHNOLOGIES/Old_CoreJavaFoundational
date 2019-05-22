import java.util.*;
public class phMap
{
	 public static void main(String[]args) 
	 {
	 	
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

      hmap.put(1200, "redmi");
      hmap.put(21000, "samsung");
      hmap.put(10000, "Letv");
      hmap.put(4900, "Lenovo");
      hmap.put(8000, "Oppo");

      Set set = hmap.entrySet();
      System.out.println("the set is :"+hmap.entrySet());
      Iterator iterator = set.iterator();
      while(iterator.hasNext())
       {
         Map.Entry m = (Map.Entry)iterator.next();
         System.out.print("\nkey is: "+ m.getKey() + " & Value is: "+m.getValue());
       }



      String v= hmap.get(1200);
      System.out.println("\nValue at index  is: "+v);
      hmap.remove(10000);
      System.out.println("\nkey values after remove is:");
      Set set1 = hmap.entrySet();
      Iterator i = set1.iterator();
      while(i.hasNext()) 
      {
          Map.Entry m1 = (Map.Entry)i.next();
          System.out.print("Key is: "+m1.getKey() + " & Value is: ");
          System.out.println(m1.getValue());
       }

   }
}
	 
