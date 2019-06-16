package com.lxisoft.InternsLXI;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.io.*;
public class HashSetStore<T> implements CollectionRepository<T>{

String data;
Set<T> hs = new HashSet<T>();

public void create(T data){
	hs.add(data);
}
public void read(){
	System.out.println(hs);
}
public void update(T data,T data1){
	if(hs.contains(data)){
	    hs.remove(data);
	    hs.add(data1);
	    System.out.println(hs);
}
}
public void delete(T data){
	if(hs.contains(data)){
		hs.remove(data);
		System.out.println(hs);
	}

}
public void sort(){
    try {
    	throw new CannotSortException("Cannot sort this type");
        // execute SQL statements..
    } catch (Exception ex) {
         ex.printStackTrace();
        //throw new CannotSortException("Cannot sort this type", ex);
    }
}




}