package com.lxisoft.InternsLXI;
import java.util.*;
import java.io.*;
public class TreeSetStore<T> implements CollectionRepository<T>{

String data;
Set<T> ts = new TreeSet<T>();
Class<T> type;

public TreeSetStore(Class<T> type){
	this.type=type;
}
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
public void delete(T data)
{
	if(ts.contains(data)){
		ts.remove(data);
		System.out.println(ts);
	}

}
public void sort(){
	if(type.equals(Integer.class)||type.equals(String.class)){
		Object[] object=ts.toArray();
		Arrays.sort(object);
		for(Object tree:object){
			System.out.println(tree);
		}
	}
	else
	{
    System.out.println(ts);           

}
}


}