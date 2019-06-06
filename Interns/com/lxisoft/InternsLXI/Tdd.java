package com.lxisoft.InternsLXI;
import java.util.*;
public class Tdd{

	public static void main(String[] args){

	// ArrayListStore alstore = new ArrayListStore();
	// alstore.display();
	CollectionRepository<String> hsstore = new HashSetStore<String>();
	//CollectionRepository<String> hsstore = new TreeSetStore<String>();
	hsstore.create("sree");
	hsstore.create("anu");
	hsstore.read();

	}
}