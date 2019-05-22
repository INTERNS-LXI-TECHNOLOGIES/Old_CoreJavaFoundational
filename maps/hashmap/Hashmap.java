import java.util.*;
public class Hashmap{

	public static void main(String[] args){
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(111,"arun");
		hm.put(102,"varun");
		hm.put(200,"sidhu");


	for(Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
	System.out.println("*******************");
	hm.putIfAbsent(100,"pooja");
	for(Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
	System.out.println("*******************");
	HashMap<Integer,String> set=new HashMap<Integer,String>();
	set.put(120,"kavya");
	set.putAll(hm);
	for(Map.Entry m:set.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
	System.out.println("*******************");
	Iterator itr=set.entrySet().iterator();
	while(itr.hasNext()){
	Map.Entry mp=(Map.Entry)itr.next();
	System.out.println(mp.getKey()+" "+mp.getValue());	
	}
	}
}