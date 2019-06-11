package com.lxisoft.InternsLXI;
import java.util.*;
public class Tdd{

	public static void main(String[] args){

	// ArrayListStore alstore = new ArrayListStore();
	// alstore.display();
	CollectionRepository<Intern> store = new PriorityQueueStore<Intern>();
	Intern intern1=new Intern("Ammu");
	Intern intern2=new Intern("Mithya");
	Intern intern3=new Intern("Pavana");
	Intern intern4=new Intern("Bhavana");
	store.create(intern1);
	store.create(intern2);
	store.create(intern3);
	store.read();
	store.update(intern1,intern4);
	store.delete(intern2);
	store.sort();


	}
}