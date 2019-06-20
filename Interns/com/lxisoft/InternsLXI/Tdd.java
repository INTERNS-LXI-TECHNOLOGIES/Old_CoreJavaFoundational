package com.lxisoft.InternsLXI;
import java.util.*;
import java.util.logging.*;
import java.io.*;
public class Tdd{

	public static void main(String[] args){
		
	// CollectionRepository<Integer> store = new LinkedListStore<Integer>(Integer.class);
	// store.create(789);
	// store.create(234);
	// store.create(345);
	// store.create(695);
	// store.create(775);
	// store.create(435);
	// store.read();
	// store.update(234,100);
	// store.delete(435);
	// store.sort();

	// CollectionRepository<String> store = new ArrayListStore<String>(String.class);
	// store.create("Ammu");
	// store.create("Mithya");
	// store.create("Pavana");
	// store.create("Theertha");
	// store.create("Gopi");
	// store.create("Chippy");
	// store.create("Radu");
	// store.read();
	// store.update("Ammu","Bavana");
	// store.delete("Pavana");
	// store.sort();
	
	CollectionRepository<Intern> store = new ArrayListStore<Intern>(Intern.class);
	Intern intern1=new Intern("Avani");
	Intern intern2=new Intern("Mithya");
	Intern intern3=new Intern("Pavana");
	Intern intern4=new Intern("Bhavana");
	Intern intern5=new Intern("Aswathi");
	Intern intern6=new Intern("Sheethal");
	store.create(intern1);
	store.create(intern2);
	store.create(intern3);
	//store.create(intern4);
	store.create(intern5);
	store.create(intern6);
	System.out.println("*******************ARRAYLIST*******************");
	store.read();
	//LoggerDemo.log().info(store.read().toString());
	store.update(intern1,intern4);
	//LoggerDemo.log().info(store.read().toString());
	store.delete(intern2);
	//LoggerDemo.log().info(store.read().toString());
	store.sort();
	//LoggerDemo.log().info(store.read().toString());
	



	}
}