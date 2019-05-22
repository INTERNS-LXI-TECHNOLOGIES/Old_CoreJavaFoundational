import java.util.*; 
  
class ph 
{ 
    public static void main(String[]args) 
    { 
        Set<String> h = new HashSet<String>(); 
  
 
        h.add("5lenovo"); 
        h.add("3Letv"); 
        h.add("6samsung"); 
        h.add("1Letv");
        h.add("6samsung");
   
        System.out.println(h); 
        System.out.println("List contains Letv or not:" + 
                           h.contains("1Letv")); 
  
     
        h.remove("6samsung"); 
        System.out.println(h); 
  

        System.out.println("list  :"); 
        Iterator i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
    } 
} 