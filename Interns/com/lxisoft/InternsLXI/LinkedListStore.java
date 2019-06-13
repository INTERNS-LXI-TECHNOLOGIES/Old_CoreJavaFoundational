package com.lxisoft.InternsLXI;
import java.util.*;
import java.util.concurrent.*;
public class LinkedListStore<T> implements CollectionRepository<T>{

List<T> as = new LinkedList<T>();

public void create(T data){
	as.add(data);
}

public void read(){
	System.out.println(as);
} 
public void update(T data,T data1){
	Iterator it = as.iterator();
		while(it.hasNext()){
			if(it.next().equals(data)){
			as.remove(data);
	    	as.add(data1);
			}
		}
	System.out.println(as);
}
public void delete(T data){
	Iterator<T> itr=as.iterator();
		while(itr.hasNext()){
			if(itr.next().equals(data));{
				as.remove(data);
			}	
		}
	System.out.println(as);
	}
public void sort(){
	Collections.sort(al, new Comparator() {
	public int compare(Object s1, Object s2) {
	return (((Intern)s1).name).compareTo(((Intern)s2).name);
} } );
	System.out.println(al);
}
}



