package com.lxisoft.InternsLXI;
import java.util.*;
import java.util.Comparator;
public class LinkedListStore<T> implements CollectionRepository<T>{

List<T> list = new LinkedList<T>();

Class<T> type;
public LinkedListStore(Class<T> type){
	this.type=type;
}
public void create(T data){
	list.add(data);
}

public void read(){
	System.out.println(list);
} 
public void update(T data,T data1){
	for(int i=0;i<list.size();i++){
		if(list.get(i).equals(data)){
			list.remove(i);
			list.add(data1);
		}
	}
	System.out.println(list);
}
public void delete(T data){
	for(int i=0;i<list.size();i++){
		if(list.get(i).equals(data)){
			list.remove(i);
		}
	}
	System.out.println(list);
}
public void sort(){
	if(type.equals(Integer.class) || type.equals(String.class)){
		Object[] object=list.toArray();
		Arrays.sort(object);
		for(Object a:object){
			System.out.println(a);
		}
	}
	else
	{
	Collections.sort(list, new Comparator() {
	public int compare(Object s1, Object s2) {
	return (((Intern)s1).name).compareTo(((Intern)s2).name);
} } );
	System.out.println(list);
}
}
}



