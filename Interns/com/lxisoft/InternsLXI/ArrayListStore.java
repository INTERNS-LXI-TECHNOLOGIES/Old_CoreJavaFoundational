package com.lxisoft.InternsLXI;
import java.util.*;
public class ArrayListStore implements CollectionRepository{

ArrayList<Intern> array = new ArrayList<Intern>();
	public void create(){
		
		array.add(new Intern("abu","q",12));
		array.add(new Intern("ayan","e",14));
	}
	public void read(){
		System.out.println(array);
	}
	public void update(){
		for(int i=0;i<array.size();i++){

		}
	}
	public void delete(){

	}
	public void sort(){

	}
}