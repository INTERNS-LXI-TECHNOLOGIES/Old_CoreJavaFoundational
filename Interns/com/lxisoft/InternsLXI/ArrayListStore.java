package com.lxisoft.InternsLXI;
import java.util.*;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.*;
import java.io.*;
public class ArrayListStore<T> implements CollectionRepository<T>{

List<T> al = new CopyOnWriteArrayList<T>();

Class<T> type;
public ArrayListStore(Class<T> type){
	this.type=type;
}
public void create(T data){
	LoggerDemo.log().info("created");
	al.add(data);
}
public Collection<T> read(){
	LoggerDemo.log().info(al.toString());
	return al;
} 
public void update(T data,T data1){
	Iterator it = al.iterator();
		while(it.hasNext()){
			if(it.next().equals(data)){
			al.remove(data);
	    	al.add(data1);
			}
		}
	LoggerDemo.log().info(al.toString());
}

public void delete(T data){
	Iterator<T> itr=al.iterator();
		while(itr.hasNext()){
			if(itr.next().equals(data));{
				al.remove(data);
			}	
		}
	LoggerDemo.log().info(al.toString());
	}
public void sort(){
	if(type.equals(Integer.class)||type.equals(String.class))
	{
		Object[] objects = al.toArray();
		Arrays.sort(objects);
		for(Object array:objects){
			System.out.println(array);
		}
	LoggerDemo.log().info(al.toString());
	}
	else
	{
	Collections.sort(al, new Comparator() {
	public int compare(Object s1, Object s2) {
	return (((Intern)s1).name).compareTo(((Intern)s2).name);
} } );
	LoggerDemo.log().info(al.toString());
}

}
}


