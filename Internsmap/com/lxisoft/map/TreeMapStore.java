package com.lxisoft.map;
import java.util.*;
public class TreeMapStore<K,V> implements MapRepository<K,V>{

		TreeMap<K,V> tm = 
             new TreeMap<K,V>();

public void create(K data,V data1){
	tm.put(data,data1);
}
public void read(){
	for(Map.Entry m:tm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
public void update(K data,V data1){
	tm.replace(data,data1);
	System.out.println("*************");
	for(Map.Entry m:tm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
public void delete(K data){
	tm.remove(data);
	System.out.println("************");
	for(Map.Entry m:tm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
public void sort(){
	System.out.println("************");
	for(Map.Entry m:tm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}