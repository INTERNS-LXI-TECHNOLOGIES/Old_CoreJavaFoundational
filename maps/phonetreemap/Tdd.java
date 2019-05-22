import java.util.*;
public class Tdd{

	public static void main(String[] args){
		//HashSet contains only values whereas HashMap contains an entry(key and value).
		Map<Integer,Phone> Tmap=new TreeMap<Integer,Phone>();
		Phone p1=new Phone("iPhoneX","apple",25000);
		Phone p2=new Phone("Lenovok6","Lenovo",10000);
		Phone p3=new Phone("motoG5","Lenovo",12000);
		Tmap.put(100,p1);
		Tmap.put(110,p2);
		Tmap.put(200,p3);
		for(Map.Entry map:Tmap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
		System.out.println("*****************");
		Phone p4=new Phone("galaxys5","Samsung",23000);
		Tmap.putIfAbsent(130,p4);
		for(Map.Entry map:Tmap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
		System.out.println("*****************");
		Tmap.replace(100,p3);
		for(Map.Entry map:Tmap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
		System.out.println("*****************");
		Tmap.remove(130);
		for(Map.Entry map:Tmap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
		System.out.println("*****************");
		Iterator itr=Tmap.entrySet().iterator();
	    while(itr.hasNext()){
		Map.Entry mp=(Map.Entry)itr.next();
		System.out.println(mp.getKey()+" "+mp.getValue());
	}
}

}