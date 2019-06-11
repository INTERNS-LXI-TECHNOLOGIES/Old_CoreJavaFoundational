package com.lxisoft.InternsLXI;
import java.util.*;
//import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
public class ArrayListStore<T> implements CollectionRepository<T>{

List<T> as = new CopyOnWriteArrayList<T>();

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
public void update(){
	
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

}
// public int compareTo(T data,T data1) {  
    
//     return data.compareTo(data1);
// } 
// public String toString(){

//     return data;
// }

}


