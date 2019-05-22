import java.util.*;
public class Tdd{

	public static void main(String[] args){
		//HashSet contains only values whereas HashMap contains an entry(key and value).
		Map<Integer,Phone> hmap=new HashMap<Integer,Phone>();
		Phone p1=new Phone("iPhoneX","apple",25000);
		Phone p2=new Phone("Lenovok6","Lenovo",10000);
		Phone p3=new Phone("motoG5","Lenovo",12000);
		hmap.put(3,p1);
		hmap.put(2,p2);
		hmap.put(1,p3);
		for(Map.Entry map:hmap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
		System.out.println("*****************");
		Phone p4=new Phone("galaxys5","Samsung",23000);
		hmap.putIfAbsent(4,p4);
		for(Map.Entry map:hmap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
		System.out.println("*****************");
		hmap.replace(1,p3);
		for(Map.Entry map:hmap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
		System.out.println("*****************");
		hmap.remove(1);
		for(Map.Entry map:hmap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}

}