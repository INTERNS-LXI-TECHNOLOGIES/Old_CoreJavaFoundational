package com.lxisoft.InternsLXI;
import java.util.*;
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

	CollectionRepository<String> store = new LinkedHashSetStore<String>();
	store.create("Ammu");
	store.create("Mithya");
	store.create("Pavana");
	store.create("Theertha");
	store.create("Gopi");
	store.create("Chippy");
	store.create("Radu");
	store.read();
	store.update("Ammu","Bavana");
	store.delete("Pavana");
	store.sort();

	// CollectionRepository<Intern> store = new PriorityQueueStore<Intern>();
	// Intern intern1=new Intern("Ammu");
	// Intern intern2=new Intern("Mithya");
	// Intern intern3=new Intern("Pavana");
	// Intern intern4=new Intern("Bhavana");
	// Intern intern5=new Intern("Aswathi");
	// Intern intern6=new Intern("Sheethal");
	// store.create(intern1);
	// store.create(intern2);
	// store.create(intern3);
	// store.create(intern5);
	// store.create(intern6);
	// System.out.println("*******************ARRAYLIST*******************");
	// store.read();
	// store.update(intern1,intern4);
	// store.delete(intern2);
	// store.sort();
	// CollectionRepository<Intern> store1 = new LinkedListStore<Intern>();
	// Intern internn1=new Intern("Ammu");
	// Intern internn2=new Intern("Mithya");
	// Intern internn3=new Intern("Pavana");
	// Intern internn4=new Intern("Bhavana");
	// Intern internn5=new Intern("Aswathi");
	// Intern internn6=new Intern("Sheethal");
	// store1.create(intern1);
	// store1.create(intern2);
	// store1.create(intern3);
	// store1.create(intern5);
	// store1.create(intern6);
	// System.out.println("*******************LINKEDLIST*******************");
	// store1.read();
	// store1.update(intern1,intern4);
	// store1.delete(intern2);
	// store1.sort();



	}
}