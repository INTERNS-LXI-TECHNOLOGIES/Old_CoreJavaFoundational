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

		MapRepository<Integer,User> a = new TreeMapStore<>(Integer.class);
		a.create(1,new User(20,"asd"));
		a.create(9,new User(15,"xsd"));
		a.create(7,new User(14,"esd"));
		User x = new User(33,"tuv");
		a.create(4,x);
//		CollectionRepository<String> a = new HashSetStore<>(String.class);
//		a.create(1,"asd");
//		a.create(5,"xsd");
//		a.create(3,"zsd");
		//a.sort();
		//a.update(x,new User(2,"uef"));
		a.sortByValue("name");
		System.out.println(a.readAll());

	}

}
