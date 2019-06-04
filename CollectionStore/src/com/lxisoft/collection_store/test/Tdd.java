/**
 * 
 */
package com.lxisoft.collection_store.test;

import com.lxisoft.collection_store.collections.ArrayListStore;
import com.lxisoft.collection_store.collections.CollectionRepository;
import com.lxisoft.collection_store.collections.LinkedListStore;
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

		CollectionRepository<Integer> a = new TreeSetStore<>(Integer.class);
		a.create(2);
		a.create(8);
		a.create(5);
		a.sort();
		//a.update(2,new User(2,"uef"));
		System.out.println(a.readAll());

	}

}
