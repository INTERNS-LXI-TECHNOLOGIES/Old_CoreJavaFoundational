package com.lxisoft.map;
import java.util.*;
public class LinkedHashMapStore<K,V> implements MapRepository<K,V>{
	
	Map<K,V> hm=new HashMap<K,V>();

public void create(K data,V data1){
	hm.put(data,data1);
}
public void read(){
	for(Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
public void update(K data,V data1){
	hm.replace(data,data1);
	System.out.println("*************");
	for(Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
public void delete(K data){
	hm.remove(data);
	System.out.println("************");
	for(Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
public void sort(){
    try {
    	throw new CannotSortException("LinkedHashMap doesnot contain any method for sorting");
        // execute SQL statements..
    } catch (Exception ex) {
         ex.printStackTrace();
    }
}
	
}  