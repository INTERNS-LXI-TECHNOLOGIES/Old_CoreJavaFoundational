/**
 * 
 */
package com.lxisoft.collection_store.test;

import com.lxisoft.collection_store.collections.ArrayListStore;
import com.lxisoft.collection_store.collections.CollectionRepository;
import com.lxisoft.collection_store.collections.HashSetStore;
import com.lxisoft.collection_store.collections.LinkedHashSetStore;
import com.lxisoft.collection_store.collections.LinkedListStore;
import com.lxisoft.collection_store.collections.MapRepository;
import com.lxisoft.collection_store.collections.PriorityQueueStore;
import com.lxisoft.collection_store.collections.TreeMapStore;
import com.lxisoft.collection_store.collections.TreeSetStore;
import com.lxisoft.collection_store.collections.User;

/**
 * @author anish
 *
 */
public class Tdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MapRepository<Integer,User> a = new TreeMapStore<>();
		a.create(1,new User(20,"asd"));
		a.create(2,new User(15,"xsd"));
		a.create(3,new User(14,"esd"));
		User x = new User(33,"tuv");
		a.create(4,x);
//		CollectionRepository<String> a = new HashSetStore<>(String.class);
//		a.create("asd");
//		a.create("xsd");
//		a.create("esd");
		//a.sort();
		//a.update(x,new User(2,"uef"));
		System.out.println(a.readAll());

	}

}
