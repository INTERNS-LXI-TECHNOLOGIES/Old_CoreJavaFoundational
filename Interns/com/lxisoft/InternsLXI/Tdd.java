package com.lxisoft.InternsLXI;
import java.util.*;
import java.util.logging.*;
import java.io.*;
public class Tdd{
	private final static Logger logger=Logger.getLogger(Tdd.class.getName());

	public static void main(String[] args){
		try{
		FileHandler fh = new FileHandler("logger.log");
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		logger.addHandler(fh);
		logger.setUseParentHandlers(false);
		fh.setFormatter(simpleFormatter);
	}
	catch(IOException e){
		e.printStackTrace();
	}
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
	
	CollectionRepository<Intern> store = new PriorityQueueStore<Intern>(Intern.class);
	Intern intern1=new Intern("Ammu");
	Intern intern2=new Intern("Mithya");
	Intern intern3=new Intern("Pavana");
	Intern intern4=new Intern("Bhavana");
	Intern intern5=new Intern("Aswathi");
	Intern intern6=new Intern("Sheethal");
	store.create(intern1);
	store.create(intern2);
	store.create(intern3);
	store.create(intern5);
	store.create(intern6);
	System.out.println("*******************ARRAYLIST*******************");
	logger.info(store.read().toString());
	store.update(intern1,intern4);
	logger.info(store.read().toString());
	store.delete(intern2);
	logger.info(store.read().toString());
	store.sort();
	logger.info(store.read().toString());
	



	}
}