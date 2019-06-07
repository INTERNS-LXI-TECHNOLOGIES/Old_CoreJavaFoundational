import java.util.*;
public class Hashtable{

	public static void main(String[] args){
	  	java.util.Hashtable<Integer,String> h = new java.util.Hashtable<Integer,String>();
	  	h.put(2,"Abhi");
	  	h.put(1,"Pavan");
	  	h.put(4,"Babu");
	  	h.put(3,"Ravi");
	  	java.util.Hashtable<Integer,String> h1 = new java.util.Hashtable<Integer,String>();
	  	h1 = (java.util.Hashtable<Integer,String>)h.clone();
	  	System.out.println(h1);
	  	System.out.println(h1.contains("Pavan"));
	  	System.out.println(h1.contains("apoorva"));
	  	Enumeration e = h.elements(); 
        while (e.hasMoreElements()) { 
            System.out.println(e.nextElement()); 
        }
        if(h.equals(h1)){
        	System.out.println("both are equal");
        }
        System.out.println(h1.get(1)); 
	}
}