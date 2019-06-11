package com.lxisoft.InternsLXI;
import java.util.*;
import java.io.*;
public class LinkedHashSetStore<T> implements CollectionRepository<T>{

String data;
Set<T> lhs = new LinkedHashSet<T>();

public void create(T data){
	lhs.add(data);
}
public void read(){
	System.out.println(lhs);
}
public void update(T data,T data1){
	if(lhs.contains(data)){
	    lhs.remove(data);
	    lhs.add(data1);
	    System.out.println(lhs);
}
}
public void update(){
	
}
public void delete(T data){
	if(lhs.contains(data)){
		lhs.remove(data);
		System.out.println(lhs);
	}

}
public void sort(){
	TreeSet<T> list =new TreeSet<T>(lhs);
    System.out.println(list);           

}
// public int compareTo(){

// }

}