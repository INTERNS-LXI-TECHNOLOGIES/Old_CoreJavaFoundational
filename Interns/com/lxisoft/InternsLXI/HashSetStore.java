package com.lxisoft.InternsLXI;
import java.util.*;
public class HashSetStore<T> implements CollectionRepository<T>{

String data;
Set<T> hs = new HashSet<T>();

public void create(T data){
	hs.add(data);
}
public void read(){
	Iterator itr = hs.iterator();

	while (itr.hasNext()){
	System.out.println(itr.next());

}
}
public void update(){

}  
public void delete(){

}
public void sort(){

}


}