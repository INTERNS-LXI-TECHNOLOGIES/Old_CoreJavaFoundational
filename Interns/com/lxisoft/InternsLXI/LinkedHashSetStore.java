package com.lxisoft.InternsLXI;
import java.util.*;
import java.io.*;
import java.util.logging.*;
public class LinkedHashSetStore<T> implements CollectionRepository<T>{

String data;
Set<T> lhs = new LinkedHashSet<T>();

public void create(T data){
	lhs.add(data);
}
public Collection<T> read(){
	return lhs;
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
	try {
    	throw new CannotSortException("LinkedHashSet doesnot contain any method for sorting");
        // execute SQL statements..
    } catch (Exception ex) {
         ex.printStackTrace();
    }
}

}