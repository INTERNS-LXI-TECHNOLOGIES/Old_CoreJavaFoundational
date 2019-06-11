package com.lxisoft.InternsLXI;
import java.util.*;
import java.io.*;
public class TreeSetStore<T> implements CollectionRepository<T>{

String data;
Set<T> ts = new TreeSet<T>();

public void create(T data){
	ts.add(data);
}
public void read(){
	System.out.println(ts);
}
public void update(T data,T data1){
	if(ts.contains(data)){
	    ts.remove(data);
	    ts.add(data1);
	    System.out.println(ts);
}
}
public void update(){
	
}
public void delete(T data){
	if(ts.contains(data)){
		ts.remove(data);
		System.out.println(ts);
	}

}
public void sort(){
    System.out.println(ts);           

}
// public int compareTo(){

// }


}