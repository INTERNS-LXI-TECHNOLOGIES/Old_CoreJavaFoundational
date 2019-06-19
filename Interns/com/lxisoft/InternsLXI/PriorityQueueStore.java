package com.lxisoft.InternsLXI;
import java.util.*;
import java.io.*;
import java.util.logging.*;
public class PriorityQueueStore<T> implements CollectionRepository<T>{

String data;
PriorityQueue<T> queue=new PriorityQueue<T>();	
Class<T> type;
public PriorityQueueStore(Class<T> type){
	this.type=type;
}
public void create(T data){
	queue.add(data);
}
public Collection<T> read(){
	return queue;
}
public void update(T data,T data1){
	if(queue.contains(data)){
	    queue.remove(data);
	    queue.add(data1);
	    System.out.println(queue);
}

}
public void delete(T data){
	if(queue.contains(data)){
		queue.remove(data);
		System.out.println(queue);
	}

}
public void sort(){
	if(type.equals(Integer.class)||type.equals(String.class)){
		T sorted;
 	while((sorted = queue.poll())!=null){
 		System.out.println(sorted);
 	
	}
	}
	else
	{	 
 	T sorted;
 	while((sorted = queue.poll())!=null){
 		System.out.println(sorted);
 	
	}
	}	 
} 

}