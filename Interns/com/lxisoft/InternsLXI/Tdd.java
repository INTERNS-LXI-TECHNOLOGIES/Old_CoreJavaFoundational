package com.lxisoft.InternsLXI;
import java.util.*;
public class Tdd{

	public static void main(String[] args){

	// ArrayListStore alstore = new ArrayListStore();
	// alstore.display();
	CollectionRepository<String> hsstore = new LinkedListStore<String>();
	//CollectionRepository<String> hsstore = new TreeSetStore<String>();
	hsstore.create("sree");
	hsstore.create("anu");
	hsstore.create("tara");
	hsstore.create("vidya");
	hsstore.read();
	hsstore.update("sree","manu");
	hsstore.delete("anu");
	hsstore.sort();
	//hsstore.compare("manu","anu","tara","vidya");


	}
}