package com.lxisoft.InternsLXI;
import java.util.*;
import java.io.*;
public class PriorityQueueStore<T> implements CollectionRepository<T>{

String data;
PriorityQueue<T> queue=new PriorityQueue<T>();	

public void create(T data){
	queue.add(data);
	
}
public void read(){
	System.out.println(queue);
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
	Comparator<Intern> internsNameComparator = new Comparator<Intern>() {
            @Override
            public int compare(Intern data, Intern data1) {
                return data.compareTo(data1);
            }
        };

System.out.println("\nInterns (Sorted by Name) : " + queue);
} 
}  