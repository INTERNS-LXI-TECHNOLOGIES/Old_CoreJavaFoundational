package com.lxisoft.InternsLXI;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.io.*;
import java.util.logging.*;
public class HashSetStore<T> implements CollectionRepository<T>{

String data;
Set<T> hs = new HashSet<T>();

Class<T> type;
public HashSetStore(Class<T> type){
	this.type=type;
}
public void create(T data){
	hs.add(data);
}
public Collection<T> read(){
	return hs;
}
public void update(T data,T data1){
	if(hs.contains(data)){
	    hs.remove(data);
	    hs.add(data1);
}
}
public void delete(T data){
	if(hs.contains(data)){
		hs.remove(data);
	}

}
public void sort(){
    try {
    	throw new CannotSortException("HashSet doesnot contain any method for sorting");
        // execute SQL statements..
    } catch (Exception ex) {
         ex.printStackTrace();
    }
}




}